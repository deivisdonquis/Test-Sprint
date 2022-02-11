package test.backen.deivis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import test.backen.deivis.entity.Alquiler;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Long >   {
	
	//esto me funciona en PosgreSQL para ejecutar funciones o procedimientos almacenados
	@Query(value= "select count(1) from tienda.cobrar_alquiler()", nativeQuery=true)
	public int CobrarAlquiler();

}
