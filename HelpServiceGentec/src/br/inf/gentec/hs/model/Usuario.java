package br.inf.gentec.hs.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="usuario")
public class Usuario implements ObjectModel {
	private static final long serialVersionUID = 8500821343218426152L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private Long id;
	
	@Column(name="nome_usuario", nullable=false, length=100)
	private String nomeCompleto;
	
	@Column(name="cpf_usuario", nullable=false, length=14)
	private String numeroCPF;
	
	@Column(name="senha_usuario", nullable=false, length=100)
	private String senha;
	
	@Column(name="datacadastro_usuario", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(name="telefone_usuario", nullable=true, length=13)
	private String telefone;
	
	@Column(name="email_usuario", nullable=false, length=100)
	private String email;
	
	@Column(name="ramal_usuario", nullable=true, length=6)
	private String ramal;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_nivelacesso", referencedColumnName="id_nivelacesso", nullable=false)
	private NivelAcesso nivelAcesso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public NivelAcesso getNivelAcesso() {
		if(nivelAcesso == null) {
			nivelAcesso = new NivelAcesso();
		}
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
}
