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
@Table(name="placamae")
public class HwPlacaMae implements ObjectModel {
	private static final long serialVersionUID = -632734990635845724L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_placamae")
	private Long id;
	
	@Column(name="modelo_placamae")
	private String modeloPlacaMae;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModeloPlacaMae() {
		return modeloPlacaMae;
	}

	public void setModeloPlacaMae(String modeloPlacaMae) {
		this.modeloPlacaMae = modeloPlacaMae;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
