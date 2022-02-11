package test.backen.deivis.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="alquiler")
public class Alquiler implements Serializable {

	private static final long serialVersionUID = 5408047324025005877L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codalq;
	
	@Temporal(TemporalType.DATE )
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="fecha")
	private Date fecha;
	
	private Integer valor;
		
	@ManyToOne
    @JoinColumn(name = "codcli", nullable=false )
    private Cliente cliente;
	
	//relacion uno a muchos con detallealquiler
	@OneToMany(mappedBy = "alquiler" )
    private List<DetalleAlquiler> detalleAlquilers;
	
	//////////////////////////////////
	
	public Alquiler() {
		super();
	}
	
	public Alquiler(Date fecha, Integer valor, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public Alquiler(Date fecha, Integer valor) {
		super();
		this.fecha = fecha;
		this.valor = valor;
		
	}

	public void setCodalq(Long codalq) {
		this.codalq = codalq;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public List<DetalleAlquiler> getDetalleAlquilers() {
	return detalleAlquilers;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getCodalq() {
		return codalq;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
