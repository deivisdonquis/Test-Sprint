package test.backen.deivis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.backen.deivis.entity.Cd;
import test.backen.deivis.repository.CdRepository;

@Service
public class CdServiceImp implements CdService {

	@Autowired
	private CdRepository cdRepository;
	
	@Override
	@Transactional(readOnly= true)
	public Iterable<Cd> findAll() {
		// TODO Auto-generated method stub
		return cdRepository.findAll();
	}

	@Override
	@Transactional(readOnly= true)
	public Page<Cd> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return cdRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly= true)
	public Optional<Cd> findById(Long codcd) {
		// TODO Auto-generated method stub
		return cdRepository.findById(codcd);
	}

	@Override
	@Transactional
	public Cd save(Cd cd) {
		// TODO Auto-generated method stub
		return cdRepository.save(cd);
	}

	@Override
	@Transactional
	public void deleteById(Long codcd) {
		// TODO Auto-generated method stub
		cdRepository.deleteById(codcd);
		
	}

}
