package br.inf.gentec.hs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="statuschamado")
public class StatusChamado implements ObjectModel {
	private static final long serialVersionUID = -4885248270379605153L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_depedenciachamado")
	private Long id;
	
	@Column(name="nome_depedenciachamado", nullable=false, length=100)
	private String nome;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_depedenciachamado", referencedColumnName="id_depedenciachamado")
	private DepedenciaChamado depedenciaChamado;

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

	public DepedenciaChamado getDepedenciaChamado() {
		return depedenciaChamado;
	}

	public void setDepedenciaChamado(DepedenciaChamado depedenciaChamado) {
		this.depedenciaChamado = depedenciaChamado;
	}
}
