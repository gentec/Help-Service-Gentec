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
	
	@Column(name="nome_nivelacesso", nullable=false, length=50)
	private String nome;
	
	@Column(name="permissaoXml_nivelacesso", nullable=false, length=255)
	private String permissaoXml;
	
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

	public String getPermissaoXml() {
		return permissaoXml;
	}

	public void setPermissaoXml(String permissaoXml) {
		this.permissaoXml = permissaoXml;
	}
}
