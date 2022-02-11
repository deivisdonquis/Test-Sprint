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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = -7098860917811332734L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codcli;

	@Column(length = 50)
	private String nombre;

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
	
	@Temporal(TemporalType.DATE )
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="fechan")
	private Date fechan;
	
	@Temporal(TemporalType.DATE )
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="fechai")
	private Date fechai;
	
	private Boolean estado; //1-activo 0-inactivo
	
		
	@OneToMany(mappedBy = "cliente")
    private List<Alquiler> alquileres;
	

	/////////////////////////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}

	public Date getFechai() {
		return fechai;
	}

	public void setFechai(Date fechai) {
		this.fechai = fechai;
	}


	public Date getFechan() {
		return fechan;
	}


	public void setFechan(Date fechan) {
		this.fechan = fechan;
	}


	public Long getCodcli() {
		return codcli;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTemaint() {
		return temaint;
	}

	public void setTemaint(String temaint) {
		this.temaint = temaint;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNdni() {
		return ndni;
	}

	public void setNdni(String ndni) {
		this.ndni = ndni;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
