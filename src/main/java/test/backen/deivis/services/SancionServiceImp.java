package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import test.backen.deivis.entity.Sancion;
import test.backen.deivis.repository.SancionRepository;

@Service
public class SancionServiceImp implements SancionService {
	
	@Autowired
	SancionRepository sancionRepository;

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
	public Sancion save(Sancion sancion) {
		// TODO Auto-generated method stub
		return sancionRepository.save(sancion);
	}

	@Override
	public void deleteById(Long codsan) {
		// TODO Auto-generated method stub
		sancionRepository.deleteById(codsan);
	}

}
