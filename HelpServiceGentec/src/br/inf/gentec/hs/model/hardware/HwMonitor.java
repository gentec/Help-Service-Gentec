package br.inf.gentec.hs.model.hardware;

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
import br.inf.gentec.hs.model.Fabricante;

@Entity
@Table(name="monitor")
public class HwMonitor implements ObjectModel {
	private static final long serialVersionUID = 2462409756188650923L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_monitor")
	private Long id;
	
	@Column(name="polegadas_minitor", nullable=false, length=20)
	private String polegadas;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(String polegadas) {
		this.polegadas = polegadas;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
