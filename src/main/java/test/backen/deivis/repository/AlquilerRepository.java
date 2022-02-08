package test.backen.deivis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Alquiler;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Long >   {

}
