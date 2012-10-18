package br.inf.gentec.hs.model;

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

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="chamado")
public class Chamado implements ObjectModel {
	private static final long serialVersionUID = 6777005366945006984L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_chamado")
	private Long id;
	
	@Column(name="nomeusuario_chamado", nullable=false, length=50)
	private String nomeUsuario;
	
	@Column(name="telefone_chamado", nullable=true, length=13)
	private String telefone;
	
	@Column(name="ramal_chamado", nullable=true, length=10)
	private String ramal;
	
	@Column(name="email_chamado", nullable=false, length=50)
	private String email;
	
	@Column(name="titulo_chamado", nullable=false, length=50)
	private String titulo;
	
	@Column(name="descricaoProblema_chamado", nullable=false, length=2000)
	private String descricaoProblema;
	
	//Definir se vai salvar o arquivo no banco ou so o caminho
	@Column(name="arquivo_chamado", nullable=true, length=255)
	private String arquivo;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipoproblema", referencedColumnName="id_tipoproblema")
	private TipoProblema tipoProblema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
}
