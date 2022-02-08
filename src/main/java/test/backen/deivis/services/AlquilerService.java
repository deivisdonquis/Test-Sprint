package test.backen.deivis.services;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import test.backen.deivis.dto.AlquilerDto;
import test.backen.deivis.entity.Alquiler;

public interface AlquilerService {
	
	public Iterable<Alquiler> findAll(); 	//listar 
	
	public Page<Alquiler> findAll(Pageable pageable); //listar paginada
	
	public Optional<Alquiler> findById(Long codalq);  //buscar
	
	public Alquiler save(AlquilerDto alquiler);  //crear y actualizar
	
	public void deleteById(Long codalq); //eliminar

}
