package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="tipofabricante")
public class TipoFabricante implements ObjectModel {
	private static final long serialVersionUID = 1794660791948135869L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipofabricante")
	private Long id;
	
	@Column(name="tipo_tipofabricante", nullable=false, length=100)
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
