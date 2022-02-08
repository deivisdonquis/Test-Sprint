package test.backen.deivis.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alquiler")
public class Alquiler implements Serializable {

	private static final long serialVersionUID = 5408047324025005877L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codalq;
		
	private Date fecha;
	
	private Integer valor;
		
	//@ManyToOne
    //@JoinColumn(name = "codcli", nullable = false)
    //private Cliente cliente;

	
	//relacion uno a muchos con detallealquiler
	//@OneToMany(mappedBy = "alquiler")
    //private List<DetalleAlquiler> detalleAlquilers;

	//////////////////////////////////
	
	public Alquiler() {
		super();
	}
	
	public Alquiler(Date fecha, Integer valor, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.valor = valor;
		//this.cliente = cliente;
	}

/*

	public List<DetalleAlquiler> getDetalleAlquilers() {
		return detalleAlquilers;
	}

	

	public void setDetalleAlquilers(List<DetalleAlquiler> detalleAlquilers) {
		this.detalleAlquilers = detalleAlquilers;
	}*/

	/*public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}*/

	public Long getCodalq() {
		return codalq;
	}



	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
	
	

}
