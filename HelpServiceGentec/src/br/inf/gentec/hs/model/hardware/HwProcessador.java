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
@Table(name="processador")
public class HwProcessador implements ObjectModel {
	private static final long serialVersionUID = -8657357845141459921L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_processador")
	private Long id;
	
	@Column(name="descricacao_processador", nullable=false, length=100)
	private String descricacao;
	
	@Column(name="socket_processador", nullable=false, length=10)
	private String socket;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
