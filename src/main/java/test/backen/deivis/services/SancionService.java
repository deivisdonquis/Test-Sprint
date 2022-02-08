package test.backen.deivis.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import test.backen.deivis.entity.Sancion;

public interface SancionService {
	
	public Iterable<Sancion> findAll(); 	//listar
	
	public Page<Sancion> findAll(Pageable pageable); //listar paginada
	
	public Optional<Sancion> findById(Long codsan);  //buscar
	
	public Sancion save(Sancion sancion);  //crear y actualizar
	
	public void deleteById(Long codsan); //eliminar

}
