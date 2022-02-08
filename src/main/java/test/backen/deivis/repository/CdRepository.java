package test.backen.deivis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Cd;

@Repository
public interface CdRepository extends JpaRepository<Cd,Long >   {

}
