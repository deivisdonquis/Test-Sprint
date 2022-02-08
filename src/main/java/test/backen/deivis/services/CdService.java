package test.backen.deivis.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import test.backen.deivis.entity.Cd;

public interface CdService {
	
	public Iterable<Cd> findAll(); 	//listar 
	
	public Page<Cd> findAll(Pageable pageable); //listar paginada
	
	public Optional<Cd> findById(Long codcd);  //buscar 
	
	public Cd save(Cd cd);  //crear y actualizar
	
	public void deleteById(Long codcd); //eliminar

}
