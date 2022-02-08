package test.backen.deivis.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.backen.deivis.entity.Sancion;
import test.backen.deivis.services.SancionService;


@RestController
@RequestMapping("/api/sancion")
public class SancionController {
	
	@Autowired
	private SancionService sancionService;
	
	//metodo para crear
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Sancion sancion)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(sancionService.save(sancion));
		
	}
	
	//leer 
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable Long id)
	{
		Optional<Sancion> sancionT = sancionService.findById(id);
		
		if(!sancionT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(sancionT);
		}
	}
	
	//metodo para actualizar
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Sancion sancion_det, @PathVariable(value="id") Long id )
	{
		Optional<Sancion> sancionT = sancionService.findById(id);
		
		if(!sancionT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		//sancionT.get().setCliente( sancion_det.getCliente() );
		sancionT.get().setCodalq(sancion_det.getCodalq() );
		sancionT.get().setTiposancion( sancion_det.getTiposancion());
		sancionT.get().setNumdias(sancion_det.getNumdias() );
		sancionT.get().setMontosans(sancion_det.getMontosans() );
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sancionService.save(sancionT.get()));
		
	}
	
	//metodo para  eliminar
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar( @PathVariable(value="id") Long id )
	{
		if(!sancionService.findById(id).isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		sancionService.deleteById(id);
		
		return ResponseEntity.ok().build();
		
	}
	
	
	//leer todos usuario
	@GetMapping
	public List<Sancion> leertodos()
	{
		List<Sancion> List = StreamSupport
				.stream(sancionService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return List;
	}
	
	
	
	
	

}
