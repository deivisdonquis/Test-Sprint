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

import test.backen.deivis.entity.DetalleAlquiler;
import test.backen.deivis.services.DetalleAlquilerService;

@RestController
@RequestMapping("/api/detallealquiler")
public class DetalleAlquilerController {
	
	@Autowired
	private DetalleAlquilerService detalleAlquilerService;
	
	//metodo para crear
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody DetalleAlquiler detalleAlquilers)
	{
		//haver metodo para verificar si existe el maestro
		return ResponseEntity.status(HttpStatus.CREATED).body(detalleAlquilerService.save(detalleAlquilers));
	}
	
	//leer 
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable Long id)
	{
		Optional<DetalleAlquiler> detalleAlquilerT = detalleAlquilerService.findById(id);
		
		if(!detalleAlquilerT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(detalleAlquilerT);
		}
	}
	
	//metodo para actualizar
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody DetalleAlquiler detalleAlquiler_det, @PathVariable(value="id") Long id )
	{
		Optional<DetalleAlquiler> detalleAlquilerT = detalleAlquilerService.findById(id);
		
		if(!detalleAlquilerT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		detalleAlquilerT.get().setAlquiler(       detalleAlquiler_det.getAlquiler() );
		detalleAlquilerT.get().setCd(        detalleAlquiler_det.getCd() );
		detalleAlquilerT.get().setDiasprestamo( detalleAlquiler_det.getDiasprestamo() );
		detalleAlquilerT.get().setFechadev(     detalleAlquiler_det.getFechadev() );
		
		return ResponseEntity.status(HttpStatus.CREATED).body(detalleAlquilerService.save(detalleAlquilerT.get()));
		
	}
	
	//metodo para  eliminar
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar( @PathVariable(value="id") Long id )
	{
		if(!detalleAlquilerService.findById(id).isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		detalleAlquilerService.deleteById(id);
		
		return ResponseEntity.ok().build();
		
	}
	
	
	//leer todos
	@GetMapping
	public List<DetalleAlquiler> leertodos()
	{
		List<DetalleAlquiler> List = StreamSupport
				.stream(detalleAlquilerService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return List;
	}
	
	

}
