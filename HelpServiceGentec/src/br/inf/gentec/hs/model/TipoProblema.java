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
@Table(name="tipoproblema")
public class TipoProblema implements ObjectModel {
	private static final long serialVersionUID = -3473680387232300701L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipoproblema")
	private Long id;
	
	@Column(name="descricao_tipoproblema", nullable=true, length=255)
	private String descricao;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_areaatendimento", referencedColumnName="id_areaatendimento")
	private AreaAtendimento areaAtendimento;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_sla", referencedColumnName="id_sla")
	private SLA sla;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_categoriaproblema", referencedColumnName="id_categoriaproblema")
	private CategoriaProblema categoriaProblema;

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

	public AreaAtendimento getAreaAtendimento() {
		return areaAtendimento;
	}

	public void setAreaAtendimento(AreaAtendimento areaAtendimento) {
		this.areaAtendimento = areaAtendimento;
	}

	public SLA getSla() {
		return sla;
	}

	public void setSla(SLA sla) {
		this.sla = sla;
	}

	public CategoriaProblema getCategoriaProblema() {
		return categoriaProblema;
	}

	public void setCategoriaProblema(CategoriaProblema categoriaProblema) {
		this.categoriaProblema = categoriaProblema;
	}
}
