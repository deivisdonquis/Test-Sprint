package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import test.backen.deivis.dto.DetalleAlquilerDto;
import test.backen.deivis.entity.Alquiler;
import test.backen.deivis.entity.Cd;
import test.backen.deivis.entity.Cliente;
import test.backen.deivis.entity.DetalleAlquiler;
import test.backen.deivis.repository.AlquilerRepository;
import test.backen.deivis.repository.CdRepository;
import test.backen.deivis.repository.ClienteRepository;
import test.backen.deivis.repository.DetalleAlquilerRepository;


@Service
public class DetalleAlquilerServiceImp  implements  DetalleAlquilerService{
	
	@Autowired
	DetalleAlquilerRepository detalleAlquilerRepository;
	
	@Autowired
	AlquilerRepository alquilerRepository;
	
	@Autowired
	CdRepository cdRepository;

	@Override
	public Iterable<DetalleAlquiler> findAll() {
		// TODO Auto-generated method stub
		return detalleAlquilerRepository.findAll();
	}

	@Override
	public Page<DetalleAlquiler> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return detalleAlquilerRepository.findAll(pageable);
	}

	@Override
	public Optional<DetalleAlquiler> findById(Long item) {
		// TODO Auto-generated method stub
		return detalleAlquilerRepository.findById(item);
	}

	@Override
	public DetalleAlquiler save(DetalleAlquilerDto Al) {
		// TODO Auto-generated method stub
		
		//verificando si tiene datos en la tabla maestra Alquiler
		Optional<Alquiler> At = alquilerRepository.findById( Al.getCodalq() );
		
		if(At.isPresent())  
		{
			//Verificando si el CD es valido
			Optional<Cd> Cdt = cdRepository.findById( Al.getCodcd() );
			
			if(Cdt.isPresent())  
			{
				DetalleAlquiler  detalleAlquiler = new DetalleAlquiler();
				detalleAlquiler.setAlquiler( At.get() );
				detalleAlquiler.setCd( Cdt.get() );
				detalleAlquiler.setFechadev(Al.getFechadev() );
				detalleAlquiler.setDiasprestamo( Al.getDiasprestamo() );
				
				return detalleAlquilerRepository.save( detalleAlquiler );
			}
			else
				return null;
				
			
			
		}
		else
			return null;
		
		
	}

	@Override
	public void deleteById(Long item) {
		// TODO Auto-generated method stub
		detalleAlquilerRepository.deleteById(item);
	}

}
