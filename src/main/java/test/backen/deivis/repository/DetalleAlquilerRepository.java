package test.backen.deivis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.DetalleAlquiler;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<DetalleAlquiler,Long >   {

}
