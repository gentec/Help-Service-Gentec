package br.inf.gentec.hs.model.hardware;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="cdrom")
public class HwCdRom implements ObjectModel {
	private static final long serialVersionUID = 1280922175739763010L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cdrom")
	private Long id;
	
	@Column(name="modelo_cdrom", nullable=false, length=100)
	private String modelo;
	
	@Column(name="velocidade_cdrom", nullable=false, length=10)
	private String velocidade;

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

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
}
