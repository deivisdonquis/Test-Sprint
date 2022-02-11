package test.backen.deivis.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sancion")
public class Sancion implements Serializable {

	
	private static final long serialVersionUID = 4039296428859933650L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codsan;
	
	@Column(length = 30)
	private String tiposancion;
	
	private Integer numdias;
	
	private Integer montosan;
	
	@OneToOne
	@JoinColumn(name="codalq", unique = true)
	private Alquiler alquiler;
	
	@ManyToOne
	@JoinColumn(name="codcli")
	private Cliente cliente;
	  
	////////////////////////////////////////////

	public Sancion()
	{
		super();
		
	}
	
	
	

	public Sancion(String tiposancion, Integer numdias, Integer montosans, Alquiler alquiler, Cliente cliente) {
		super();
		this.tiposancion = tiposancion;
		this.numdias = numdias;
		this.montosan = montosans;
		this.alquiler = alquiler;
		this.cliente = cliente;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Alquiler getAlquiler() {
		return alquiler;
	}




	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}



	
	
	
	public Long getCodsan() {
		return codsan;
	}

	public void setCodsan(Long codsan) {
		this.codsan = codsan;
	}







	public String getTiposancion() {
		return tiposancion;
	}

	public void setTiposancion(String tiposancion) {
		this.tiposancion = tiposancion;
	}

	public Integer getNumdias() {
		return numdias;
	}

	public void setNumdias(Integer numdias) {
		this.numdias = numdias;
	}

	public Integer getMontosans() {
		return montosan;
	}

	public void setMontosans(Integer montosans) {
		this.montosan = montosan;
	}
	
	
	
	
	
	
	
	

}
