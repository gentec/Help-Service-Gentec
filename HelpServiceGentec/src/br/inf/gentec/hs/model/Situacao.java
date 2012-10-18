package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="situacao")
public class Situacao implements ObjectModel {
	private static final long serialVersionUID = -6387075447834906932L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_situacao")
	private Long id;
	
	@Column(name="nome_situacao", nullable=false, length=100)
	private String nome;
	
	@Column(name="descricao_situacao", nullable=true, length=255)
	private String descricao;
	
	@Column(name="destaque_situacao", nullable=false, length=1)
	private boolean destaque;

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

	public boolean isDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}
}
