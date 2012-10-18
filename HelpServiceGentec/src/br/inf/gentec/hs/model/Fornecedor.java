package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="fornecedor")
public class Fornecedor implements ObjectModel {
	private static final long serialVersionUID = -6448045616223543243L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fornecedor")
	private Long id;
	
	@Column(name="email_fornecedor", nullable=false, length=100)
	private String email;
	
	@Column(name="telefone_fornecedor", nullable=true, length=13)
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
