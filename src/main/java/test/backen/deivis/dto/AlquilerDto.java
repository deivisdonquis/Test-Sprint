package test.backen.deivis.dto;

import java.io.Serializable;
import java.util.Date;


public class AlquilerDto implements Serializable {
	
	private static final long serialVersionUID = -7610451946672093872L;
	private Long codalq;
	private String fecha;
	private Integer valor;
	private Long codcli;
	private Long codcd;
	

	public Long getCodcd() {
		return codcd;
	}

	public void setCodcd(Long codcd) {
		this.codcd = codcd;
	}

	public AlquilerDto(Long codalq, String fecha, Integer valor, Long codcli) {
		super();
		this.codalq = codalq;
		this.fecha = fecha;
		this.valor = valor;
		this.codcli = codcli;
	}

	public Long getCodalq() {
		return codalq;
	}

	public void setCodalq(Long codalq) {
		this.codalq = codalq;
	}

	

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Long getCodcli() {
		return codcli;
	}

	public void setCodcli(Long codcli) {
		this.codcli = codcli;
	}
	
	

}
