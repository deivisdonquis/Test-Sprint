package test.backen.deivis.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
	
	private Date fechadev;
	
	@ManyToOne
    @JoinColumn(name = "codalq", nullable = false, updatable = false)
    private Alquiler alquiler;
	
	@ManyToOne
    @JoinColumn(name = "codcd", nullable = false, updatable = false)
    private Cd cd;
	
	
	
	/////////////////////////////////
	
	public Cd getCd() {
		return cd;
	}

	public void setCd(Cd cd) {
		this.cd = cd;
	}

	public Long getItem() {
		return item;
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
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
