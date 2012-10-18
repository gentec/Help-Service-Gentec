package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="sla")
public class SLA implements ObjectModel {
	private static final long serialVersionUID = 7768718565489736537L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_sla")
	private Long id;
	
	@Column(name="tempo_sla", nullable=false, length=5)
	private Integer tempo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
}
