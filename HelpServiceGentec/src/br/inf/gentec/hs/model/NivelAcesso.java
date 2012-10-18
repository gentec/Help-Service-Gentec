package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="nivelacesso")
public class NivelAcesso implements ObjectModel{
	private static final long serialVersionUID = 3308363699135047234L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_nivelacesso")
	private Long id;
	
	@Column(name="tipoacesso_nivelacesso", nullable=false, length=50)
	private String tipoAcesso;
	
	@Column(name="descricao_nivelacesso", nullable=false, length=255)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
