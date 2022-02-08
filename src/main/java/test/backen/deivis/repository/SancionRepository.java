package test.backen.deivis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Sancion;

@Repository
public interface SancionRepository extends JpaRepository<Sancion,Long >   {

}
