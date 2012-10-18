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
@Table(name="periferico")
public class Periferico implements ObjectModel {
	private static final long serialVersionUID = 6504334108921582742L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_periferico")
	private Long id;
	
	@Column(name="numeroserie_periferico", nullable=false, length=50)
	private String numeroSerie;
	
	@Column(name="numeronotafiscal_periferico", nullable=true, length=50)
	private String numeroNotaFiscal;
	
	@Column(name="datacompra_periferico", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date dataCompra;
	
	@Column(name="comentario_periferico", nullable=true, length=255)
	private String comentario;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipoequipamento", referencedColumnName="id_tipoequipamento")
	private TipoEquipamento tipoEquipamento;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_modelo", referencedColumnName="id_modelo")
	private Modelo modelo;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fornecedor", referencedColumnName="id_fornecedor")
	private Fornecedor fornecedor;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipogarantia", referencedColumnName="id_tipogarantia")
	private TipoGarantia tipoGarantia;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_garantia", referencedColumnName="id_garantia")
	private Garantia garantia;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_situacao", referencedColumnName="id_situacao")
	private Situacao situacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public TipoEquipamento getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public TipoGarantia getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(TipoGarantia tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	public Garantia getGarantia() {
		return garantia;
	}

	public void setGarantia(Garantia garantia) {
		this.garantia = garantia;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
