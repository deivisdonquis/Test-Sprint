package test.backen.deivis.dto;

import java.io.Serializable;

public class SancionDto implements Serializable {
	
	
	private static final long serialVersionUID = 5064075691351658067L;
	
	private Long codsan;
	private Long codalq;
	
	
	private String tiposancion;
	private Integer numdias;
	private Integer montosan;
	
	public SancionDto() {
		super();
		
	}
	
	
	public SancionDto(Long codsan, Long codalq, Long codcli, String tiposancion, Integer numdias, Integer montosan) {
		super();
		this.codsan = codsan;
		this.codalq = codalq;
		this.tiposancion = tiposancion;
		this.numdias = numdias;
		this.montosan = montosan;
	}
	
	public Long getCodsan() {
		return codsan;
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
	public Integer getMontosan() {
		return montosan;
	}
	public void setMontosan(Integer montosan) {
		this.montosan = montosan;
	}
	
	
	
	
}
