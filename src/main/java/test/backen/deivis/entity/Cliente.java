package test.backen.deivis.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 7774676845146817029L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codcli;

	@Column(length = 50)
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
/*
	@Column(length = 100)
	private String direccion;
	
	@Column(length = 100)
	private String temaint;
		
	@Column(length = 15)
	private String telefono;
		
	@Column(name="email",  length= 50)
	private String email;
	
	@Column(length = 10)
	private String ndni;
	
	@Column(length = 10)
	private String fechan;
	
	@Column(length = 10)
	private String fechai;
	
	private Boolean estado; //1-activo 0-inactivo
	
	
	@OneToMany(mappedBy = "cliente", fetch= FetchType.LAZY )
    private List<Alquiler> alquileres;
	
	@OneToMany(mappedBy = "cliente")
    private List<Sancion> sanciones;
	*/
	/////////////////////////////////////////////////////

}
