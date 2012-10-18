package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="areaatendimento")
public class AreaAtendimento implements ObjectModel {
	private static final long serialVersionUID = -1276810022355632601L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_areaatendimento")
	private Long id;
	
	@Column(name="nome_areaatendimento", nullable=false, length=100)
	private String nome;
	
	@Column(name="email_areaatendimento", nullable=false, length=100)
	private String email;
	
	@Column(name="telefone_areaatendimento", nullable=true, length=13)
	private String telefone;
	
	@Column(name="ramal_areaatendimento", nullable=true, length=10)
	private String ramal;
	
	@Column(name="status_areaatendimento", nullable=false, length=1)
	private Boolean status;

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

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
