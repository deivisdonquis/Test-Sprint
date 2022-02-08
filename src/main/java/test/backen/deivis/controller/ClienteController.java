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

import test.backen.deivis.entity.Cliente;
import test.backen.deivis.services.ClienteService;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	

	//metodo para crear
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Cliente cliente)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
		
	}
	
	//leer 
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable Long id)
	{
		Optional<Cliente> ClienteT = clienteService.findById(id);
		
		if(!ClienteT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(ClienteT);
		}
	}
	
	//metodo para actualizar
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Cliente cliente_det, @PathVariable(value="id") Long id )
	{
		Optional<Cliente> clienteT = clienteService.findById(id);
		
		if(!clienteT.isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		clienteT.get().setNombre(cliente_det.getNombre() );
		/*clienteT.get().setDireccion(cliente_det.getDireccion() );
		clienteT.get().setTemaint( cliente_det.getTemaint()  );
		clienteT.get().setTelefono( cliente_det.getTelefono() );
		clienteT.get().setEmail( cliente_det.getEmail() );
		clienteT.get().setNdni( cliente_det.getNdni() );
		clienteT.get().setFechan( cliente_det.getFechan() );
		clienteT.get().setFechai( cliente_det.getFechai() );
		clienteT.get().setEstado( cliente_det.getEstado() );*/
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(clienteT.get()));
		
	}
	
	//metodo para  eliminar
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar( @PathVariable(value="id") Long id )
	{
		if(!clienteService.findById(id).isPresent()) 
		{
			return ResponseEntity.notFound().build();
		}
		
		//verificar si no tiene alquiler
		
		clienteService.deleteById(id);
		
		return ResponseEntity.ok().build();
		
	}
	
	
	//leer todos usuario
	@GetMapping
	public List<Cliente> leertodos()
	{
		List<Cliente> List = StreamSupport
				.stream(clienteService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return List;
	}
		
	
	

}
