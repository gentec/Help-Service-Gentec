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
@Table(name="memoria")
public class HwMemoria implements ObjectModel {
	private static final long serialVersionUID = -3088804541237389980L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_memoria")
	private Long id;
	
	@Column(name="capacidade_memoria", nullable=false, length=10)
	private String capacidade;
	
	@Column(name="frequencia_memoria", nullable=false, length=10)
	private String frequencia;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
