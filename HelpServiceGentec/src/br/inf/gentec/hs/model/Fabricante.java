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
@Table(name="fabricante")
public class Fabricante implements ObjectModel {
	private static final long serialVersionUID = 8786294864968087118L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fabricante")
	private Long id;
	
	@Column(name="nome_fabricante", nullable=false, length=100)
	private String nome;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipofabricante", referencedColumnName="id_tipofabricante")
	private TipoFabricante tipoFabricante;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_tipoequipamento", referencedColumnName="id_tipoequipamento")
	private TipoEquipamento tipoEquipamento;

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

	public TipoFabricante getTipoFabricante() {
		return tipoFabricante;
	}

	public void setTipoFabricante(TipoFabricante tipoFabricante) {
		this.tipoFabricante = tipoFabricante;
	}

	public TipoEquipamento getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}
}
