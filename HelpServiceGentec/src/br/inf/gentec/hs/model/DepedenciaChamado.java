package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="depedenciachamado")
public class DepedenciaChamado implements ObjectModel {
	private static final long serialVersionUID = 633389099396793324L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_depedenciachamado")
	private Long id;
	
	@Column(name="nome_depedenciachamado", nullable=false, length=100)
	private String nome;

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
}
