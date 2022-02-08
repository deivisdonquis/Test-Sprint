package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import test.backen.deivis.dto.AlquilerDto;
import test.backen.deivis.entity.Alquiler;
//import test.backen.deivis.entity.Cd;
import test.backen.deivis.entity.Cliente;
import test.backen.deivis.repository.AlquilerRepository;
import test.backen.deivis.repository.ClienteRepository;

@Service
public class AlquilerServiceImp implements AlquilerService {
	
	@Autowired
	private AlquilerRepository alquilerRepository;
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Iterable<Alquiler> findAll() {
		// TODO Auto-generated method stub
		return alquilerRepository.findAll();
	}

	@Override
	public Page<Alquiler> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return alquilerRepository.findAll(pageable);
	}

	@Override
	public Optional<Alquiler> findById(Long codalq) {
		// TODO Auto-generated method stub
		return alquilerRepository.findById(codalq);
	}

	@Override
	public Alquiler save(AlquilerDto alq ) {
		// TODO Auto-generated method stub
		
		Optional<Cliente> Ct = clienteRepository.findById(alq.getCodcli());
		if(Ct.isPresent())  
		{
			Alquiler  alquiler = new Alquiler();
			alquiler.setFecha( alq.getFecha() );
			alquiler.setValor( alq.getValor() );
			//alquiler.setCliente(Ct.get()); alquiler.setCliente(Ct);
			
			return alquilerRepository.save(alquiler);
				
		}
		else
			return null;
	}

	@Override
	public void deleteById(Long codalq) {
		// TODO Auto-generated method stub
		alquilerRepository.deleteById(codalq);
	}

}
