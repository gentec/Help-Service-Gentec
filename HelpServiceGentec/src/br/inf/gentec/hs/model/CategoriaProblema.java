package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="categoriaproblema")
public class CategoriaProblema implements ObjectModel {
	private static final long serialVersionUID = 6267915405142962022L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_categoriaproblema")
	private Long id;
	
	@Column(name="nome_categoriaproblema", nullable=false, length=100)
	private String nome;
	
	@Column(name="prioridade_categoriaproblema", nullable=false)
	private Integer prioridade;

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

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
}
