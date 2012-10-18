package br.inf.gentec.hs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.inf.gentec.hs.api.ObjectModel;

@Entity
@Table(name="garantia")
public class Garantia implements ObjectModel {
	private static final long serialVersionUID = 7644670020267032645L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_garantia")
	private Long id;
	
	@Column(name="tempo_garantia", nullable=false, length=10)
	private String tempo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
}
