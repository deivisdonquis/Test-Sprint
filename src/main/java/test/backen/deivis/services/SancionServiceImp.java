package test.backen.deivis.services;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import test.backen.deivis.dto.SancionDto;
import test.backen.deivis.entity.Alquiler;
import test.backen.deivis.entity.Cliente;
import test.backen.deivis.entity.Sancion;
import test.backen.deivis.repository.AlquilerRepository;
import test.backen.deivis.repository.SancionRepository;

@Service
public class SancionServiceImp implements SancionService {
	
	@Autowired
	SancionRepository sancionRepository;
	
	@Autowired
	AlquilerRepository  alquilerRepository;

	@Override
	public Iterable<Sancion> findAll() {
		// TODO Auto-generated method stub
		return sancionRepository.findAll();
	}

	@Override
	public Page<Sancion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return sancionRepository.findAll(pageable);
	}

	@Override
	public Optional<Sancion> findById(Long codsan) {
		// TODO Auto-generated method stub
		return sancionRepository.findById(codsan);
	}
	
	

	@Override
	public Sancion save(SancionDto SDto) {
		// TODO Auto-generated method stub
		
		//verifico que existe el alquiler
		Optional<Alquiler> At = alquilerRepository.findById(SDto.getCodalq());
		if(At.isPresent())  
		{
			// verifico que no exista una sancion anterior de el mismo alquiler ya que la relacion es uno a uno
			Optional<Sancion> St = sancionRepository.findByAlquilerCodalq(SDto.getCodalq());
			
			if(St.isPresent())  
				return null;
			else
			{
				Sancion  sancion = new Sancion();
				sancion.setAlquiler(At.get());
				sancion.setTiposancion(SDto.getTiposancion() );
				sancion.setNumdias(SDto.getNumdias() );
				sancion.setMontosans(SDto.getMontosan() );
				sancion.setCliente( At.get().getCliente() );
				
				return sancionRepository.save( sancion );
			}
				
		}
		else
			return null;
		
	}

	@Override
	public void deleteById(Long codsan) {
		// TODO Auto-generated method stub
		sancionRepository.deleteById(codsan);
		
		/*String PERSISTENCE_UNIT_NAME = "PU2";
	    EntityManagerFactory factory2;
	    factory2 = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	    EntityManager em2 = factory2.createEntityManager();
	    boolean committed = false;*/
	}

	

}
