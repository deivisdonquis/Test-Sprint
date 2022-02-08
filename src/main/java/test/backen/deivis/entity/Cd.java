package test.backen.deivis.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cd")
public class Cd implements Serializable {
	
	private static final long serialVersionUID = -137113525004102026L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codcd;
	
	@Column(length = 100)
	private String titulo;
	
	@Column(length = 100)
	private String ubicacion;
	
	@Column(length = 10)
	private String numero;
	
	private int condicion; //0 -disponible 1- Alquilado
		
	private Boolean estado; //1-activo 0-inactivo
	
	
	//@OneToMany(mappedBy = "cd")
   // private List<DetalleAlquiler> alquileres;
	
	
	/////////////////////////////////////////////////////////
	
	
	
	/*public List<DetalleAlquiler> getAlquileres() {
		return alquileres;
	}
	
	public void setAlquileres(List<DetalleAlquiler> alquileres) {
		this.alquileres = alquileres;
	}

	
	*/

	
	


	public Long getCodcd() {
		return codcd;
	}

	public void setCodcd(Long codcd) {
		this.codcd = codcd;
	}


	public String getTitulo() {
		return titulo;
	}

	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCondicion() {
		return condicion;
	}

	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
