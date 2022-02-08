package test.backen.deivis.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import test.backen.deivis.entity.DetalleAlquiler;

public interface DetalleAlquilerService {
	
	public Iterable<DetalleAlquiler> findAll(); 	//listar 
	
	public Page<DetalleAlquiler> findAll(Pageable pageable); //listar paginada
	
	public Optional<DetalleAlquiler> findById(Long item);  //buscar 
	
	public DetalleAlquiler save(DetalleAlquiler detalleAlquiler);  //crear y actualizar
	
	public void deleteById(Long item); //eliminar

}
