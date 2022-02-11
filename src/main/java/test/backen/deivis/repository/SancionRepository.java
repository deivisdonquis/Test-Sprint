package test.backen.deivis.repository;

import java.util.Optional;

import org.hibernate.criterion.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Sancion;

@Repository
public interface SancionRepository extends JpaRepository<Sancion,Long >   {
	
	public Optional<Sancion> findByAlquilerCodalq(Long codalq);

}
