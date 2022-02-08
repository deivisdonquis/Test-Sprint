package test.backen.deivis.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sancion")
public class Sancion implements Serializable {

	private static final long serialVersionUID = 4168960819093253507L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codsan;
	
	private Long codalq;
	
	@Column(length = 30)
	private String tiposancion;
	
	private Integer numdias;
	
	private Integer montosans;
	
	@ManyToOne
    @JoinColumn(name = "codcli")
    private Cliente cliente;
	
	////////////////////////////////////////////

	public Long getCodsan() {
		return codsan;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCodsan(Long codsan) {
		this.codsan = codsan;
	}

	

	public Long getCodalq() {
		return codalq;
	}

	public void setCodalq(Long codalq) {
		this.codalq = codalq;
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
		return montosans;
	}

	public void setMontosans(Integer montosans) {
		this.montosans = montosans;
	}
	
	
	
	
	
	
	
	

}
