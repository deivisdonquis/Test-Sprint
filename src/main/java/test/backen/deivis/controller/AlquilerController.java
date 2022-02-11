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

import test.backen.deivis.dto.AlquilerDto;
import test.backen.deivis.entity.Alquiler;
import test.backen.deivis.services.AlquilerService;


@RestController
@RequestMapping("/api/alquiler")
public class AlquilerController {

	@Autowired
	private AlquilerService alquilerService;
	
		//metodo para ejecutar el procedimiento almacenado en la DB
		@PostMapping("cobrar-alquiler")
		public ResponseEntity<?> CobrarAlquiler()
		{
			int x = alquilerService.CobrarAlquiler();
			return ResponseEntity.ok().build();
		}
		
	//metodo para crear
		@PostMapping
		public ResponseEntity<?> crear(@RequestBody AlquilerDto alquiler)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(alquilerService.save(alquiler));
			
		}
		
		//leer
		@GetMapping("/{id}")
		public ResponseEntity<?> leer(@PathVariable Long id)
		{
			Optional<Alquiler> AlquilerT = alquilerService.findById(id);
			
			if(!AlquilerT.isPresent()) 
			{
				return ResponseEntity.notFound().build();
			}
			else
			{
				return ResponseEntity.ok(AlquilerT);
			}
		}
		
		//metodo para actualizar
		@PutMapping("/{id}")
		public ResponseEntity<?> actualizar(@RequestBody AlquilerDto alquiler_det, @PathVariable(value="id") Long id )
		{
			Optional<Alquiler> AlquilerT = alquilerService.findById(id);
			
			if(!AlquilerT.isPresent()) 
			{
				return ResponseEntity.notFound().build();
			}
			
			
			
			return ResponseEntity.status(HttpStatus.CREATED).body(alquilerService.save( alquiler_det ) );
			
		}
		
		//metodo para eliminar
		@DeleteMapping("/{id}")
		public ResponseEntity<?> eliminar( @PathVariable(value="id") Long id )
		{
			if(!alquilerService.findById(id).isPresent()) 
			{
				return ResponseEntity.notFound().build();
			}
			
			alquilerService.deleteById(id);
			
			return ResponseEntity.ok().build();
			
		}
		
		
		//leer todos usuario
		@GetMapping
		public List<Alquiler> leertodos()
		{
			List<Alquiler> List = StreamSupport
					.stream(alquilerService.findAll().spliterator(), false)
					.collect(Collectors.toList());
			
			return List;
		}
	
	
	
}
