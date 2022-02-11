package test.backen.deivis.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DetalleAlquilerDto implements Serializable {
	
	private static final long serialVersionUID = 1880440982272361276L;
	private Integer diasprestamo;
	private Date fechadev;
	private Long codalq;
	private Long codcd;
	
	public DetalleAlquilerDto(Integer diasprestamo, Date fechadev, Long codalq, Long codcd) {
		super();
		this.diasprestamo = diasprestamo;
		this.fechadev = fechadev;
		this.codalq = codalq;
		this.codcd = codcd;
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
	
	public Long getCodalq() {
		return codalq;
	}
	
	public void setCodalq(Long codalq) {
		this.codalq = codalq;
	}
	
	public Long getCodcd() {
		return codcd;
	}

	public void setCodcd(Long codcd) {
		this.codcd = codcd;
	}

	
}
