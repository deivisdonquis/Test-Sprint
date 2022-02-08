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

import test.backen.deivis.entity.Cd;
import test.backen.deivis.services.CdService;


@RestController
@RequestMapping("/api/cd")
public class CdController {
	
	@Autowired
	private CdService cdService;
	
	
	//metodo para crear por el post
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Cd cd)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(cdService.save(cd));
		
	}
	
	//leer por el get
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable Long id)
	{
		Optional<Cd> Cdt = cdService.findById(id);
		
		if(!Cdt.isPresent())  //verifico si no existe
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(Cdt);
		}
	}
	
	//metodo para actualizar por el metodo put
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Cd cd_det, @PathVariable(value="id") Long codcd )
	{
		Optional<Cd> cdt = cdService.findById(codcd);
		
		if(!cdt.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		//actualizado valores 
		cdt.get().setTitulo(     cd_det.getTitulo() );
		cdt.get().setUbicacion(  cd_det.getUbicacion() );
		cdt.get().setNumero(     cd_det.getNumero() );
		cdt.get().setCondicion(  cd_det.getCondicion() );
		cdt.get().setEstado(     cd_det.getEstado() );
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cdService.save(cdt.get()));
		
	}
	
	//metodo para eliminar por el delete
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar( @PathVariable(value="id") Long codcd )
	{
		if(!cdService.findById(codcd).isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		//crear un metodo para verificar si esta alquilado OJO
		cdService.deleteById(codcd);
		
		return ResponseEntity.ok().build();
		
	}
	
	
	//leer todos por el get
	@GetMapping
	public List<Cd> leertodos()
	{
		List<Cd> List = StreamSupport
				.stream(cdService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return List;
	}
	
	

}
