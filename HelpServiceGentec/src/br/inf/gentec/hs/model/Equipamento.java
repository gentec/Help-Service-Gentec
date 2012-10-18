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
@Table(name="equipamento")
public class Equipamento implements ObjectModel {
	private static final long serialVersionUID = -7217836049314008448L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_equipamento")
	private Long id;
	
	@Column(name="nomecomputador_equipamento", nullable=false, length=50)
	private String nomeComputador;
	
	@Column(name="numeroserie_equipamento", nullable=false, length=50)
	private String numeroSerie;
	
	@Column(name="comentario_equipamento", nullable=true, length=255)
	private String comentario;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_fabricante", referencedColumnName="id_fabricante")
	private Fabricante fabricante;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_modelo", referencedColumnName="id_modelo")
	private Modelo modelo;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_setor", referencedColumnName="id_setor")
	private Setor setor;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="fk_situacao", referencedColumnName="id_situacao")
	private Situacao situacao;
	
	//definir como vai ser relacionamento entre computador e configuração de Hardware
	

}
