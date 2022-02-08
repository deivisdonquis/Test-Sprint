package test.backen.deivis.dto;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DetalleAlquilerDto implements Serializable {
	
	
	
	private static final long serialVersionUID = 1880440982272361276L;
	private Integer diasprestamo;
	private String fechadev;
	private Long codalq;
	private Long codcd;
	
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
	public DetalleAlquilerDto(Integer diasprestamo, String fechadev, Long codalq, Long codcd) {
		super();
		this.diasprestamo = diasprestamo;
		this.fechadev = fechadev;
		this.codalq = codalq;
		this.codcd = codcd;
	}
	
	
	
}
