package test.backen.deivis.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detallealquiler")
public class DetalleAlquiler implements Serializable {

	private static final long serialVersionUID = -983760587394546102L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long item;
	
	private Integer diasprestamo;
	
	private String fechadev;
	
	private Long codalq;
	private Long codcd;
	
	
	//@ManyToOne(fetch= FetchType.LAZY )
    //@JoinColumn(name = "codalq", nullable = false)
    //private Alquiler alquiler;
    
	
	    
     
     public Long getCodcd() {
		return codcd;
	}


	public void setCodcd(Long codcd) {
		this.codcd = codcd;
	}


	public DetalleAlquiler() {
		super();
	}

	
	

	public DetalleAlquiler(Integer diasprestamo, String fechadev, Long codalq, Long codcd) {
		super();
		this.diasprestamo = diasprestamo;
		this.fechadev = fechadev;
		this.codalq = codalq;
		this.codcd = codcd;
	}


	/*
	
	@ManyToOne
    @JoinColumn(name = "codcd", nullable = false, updatable = false)
    private Cd cd;*/
	
	
	
	/////////////////////////////////
	/*
	public Cd getCd() {
		return cd;
	}

	public void setCd(Cd cd) {
		this.cd = cd;
	}
	*/
	
	


	public Long getCodalq() {
		return codalq;
	}


	public void setCodalq(Long codalq) {
		this.codalq = codalq;
	}


	public Long getItem() {
		return item;
	}

	
	public void setItem(Long item) {
		this.item = item;
	}

	public Integer getDiasprestamo() {
		return diasprestamo;
	}

	public void setDiasprestamo(Integer diasprestamo) {
		this.diasprestamo = diasprestamo;
	}

	public String getFechadev() {
		return fechadev;
	}

	public void setFechadev(String fechadev) {
		this.fechadev = fechadev;
	}

}
