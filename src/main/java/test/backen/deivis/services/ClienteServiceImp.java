package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import test.backen.deivis.entity.Cliente;
import test.backen.deivis.repository.ClienteRepository;


@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Iterable<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		
		return clienteRepository.findAll(pageable);
	}

	@Override
	public Optional<Cliente> findById(Long codcli) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(codcli);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	public void deleteById(Long codcli) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(codcli);
	}

}
