package test.backen.deivis.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="detallealquiler")
public class DetalleAlquiler implements Serializable {

	private static final long serialVersionUID = -983760587394546102L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long item;
	
	
	private Integer diasprestamo;
	
	@Temporal(TemporalType.DATE )
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="fechadev")
	private Date fechadev;
	

	//private Long codcd;
	
	
	@ManyToOne
    @JoinColumn(name = "codalq")
    private Alquiler alquiler;
	
	
	@ManyToOne
    @JoinColumn(name = "codcd", nullable=false )
    private Cd cd;
    
	
	public DetalleAlquiler() {
		super();
	}

	public DetalleAlquiler(Integer diasprestamo, Date fechadev, Alquiler alquiler, Cd cd) {
		super();
		this.diasprestamo = diasprestamo;
		this.fechadev = fechadev;
		this.alquiler = alquiler;
		this.cd = cd;
	}


	public Cd getCd() {
		return cd;
	}

	public void setCd(Cd cd) {
		this.cd = cd;
	}








	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
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

	public Date getFechadev() {
		return fechadev;
	}

	public void setFechadev(Date fechadev) {
		this.fechadev = fechadev;
	}

}
