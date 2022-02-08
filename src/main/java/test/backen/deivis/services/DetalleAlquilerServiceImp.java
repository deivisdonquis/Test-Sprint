package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import test.backen.deivis.entity.DetalleAlquiler;
import test.backen.deivis.repository.DetalleAlquilerRepository;


@Service
public class DetalleAlquilerServiceImp  implements  DetalleAlquilerService{
	
	DetalleAlquilerRepository detalleAlquilerRepository;

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
	public DetalleAlquiler save(DetalleAlquiler detalleAlquiler) {
		// TODO Auto-generated method stub
		return detalleAlquilerRepository.save(detalleAlquiler);
	}

	@Override
	public void deleteById(Long item) {
		// TODO Auto-generated method stub
		detalleAlquilerRepository.deleteById(item);
	}

}
