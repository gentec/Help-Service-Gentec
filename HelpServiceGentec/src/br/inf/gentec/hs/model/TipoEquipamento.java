package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="tipoequipamento")
public class TipoEquipamento implements ObjectModel {
	private static final long serialVersionUID = -7405060728745977934L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipoequipamento")
	private Long id;
	
	@Column(name="descricao_tipoequipamento", nullable=true, length=255)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
