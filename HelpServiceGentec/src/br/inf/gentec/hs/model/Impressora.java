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
@Table(name="impressora")
public class Impressora implements ObjectModel {
	private static final long serialVersionUID = 5311603371351451757L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_impressora")
	private Long id;
	
	@Column(name="modelo_impressora", nullable=false, length=100)
	private String modelo;
	
	@Column(name="rede_impressora", nullable=false, length=1)
	private Boolean rede;
	
	@Column(name="numeroip_impressora", nullable=true, length=15)
	private String numeroIP;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getRede() {
		return rede;
	}

	public void setRede(Boolean rede) {
		this.rede = rede;
	}

	public String getNumeroIP() {
		return numeroIP;
	}

	public void setNumeroIP(String numeroIP) {
		this.numeroIP = numeroIP;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
