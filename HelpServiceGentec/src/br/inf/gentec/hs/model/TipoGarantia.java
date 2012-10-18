package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="tipogarantia")
public class TipoGarantia implements ObjectModel {
	private static final long serialVersionUID = -3738988586432933500L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipogarantia")
	private Long id;
	
	@Column(name="tipo_tipogarantia", nullable=false, length=50)
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
