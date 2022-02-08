package test.backen.deivis.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import test.backen.deivis.entity.Cliente;

public interface ClienteService {
	
	public Iterable<Cliente> findAll(); 	//listar 
	
	public Page<Cliente> findAll(Pageable pageable); //listar paginada
	
	public Optional<Cliente> findById(Long codcli);  //buscar
	
	public Cliente save(Cliente Cliente);  //crear y actualizar
	
	public void deleteById(Long codcli); //eliminar

}
