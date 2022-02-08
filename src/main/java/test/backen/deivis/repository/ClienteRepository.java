package test.backen.deivis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long >   {

}
