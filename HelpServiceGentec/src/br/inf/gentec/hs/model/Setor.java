package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="setor")
public class Setor implements ObjectModel {
	private static final long serialVersionUID = -1188537781267914889L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_setor")
	private Long id;
	
	@Column(name="nome_setor", nullable=false, length=50)
	private String nome;
	
	@Column(name="descricao_setor", nullable=true, length=255)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
