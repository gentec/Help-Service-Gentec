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
@Table(name="solucaoproblema")
public class SolucaoProblema implements ObjectModel {
	private static final long serialVersionUID = -358577284228997982L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_solucaoproblema")
	private Long id;
	
	@Column(name="descricao_solucaoproblema", nullable=false, length=2500)
	private String descricao;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipoproblema", referencedColumnName="id_tipoproblema")
	private TipoProblema tipoProblema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
}
