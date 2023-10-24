package com.louay.conservatoire.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data

@Entity
public class Musicien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMusicien;
	private String nomMusicien;
	private String instrument;
	private double salaire;
	private int experienceYear;
	
	@ManyToOne
	private Band band;
	
	public Musicien(String nomMusicien, String instrument, double salaire, int experienceYear) {
		super();
		this.nomMusicien = nomMusicien;
		this.instrument = instrument;
		this.salaire = salaire;
		this.experienceYear = experienceYear;
	}

	@Override
	public String toString() {
		return "Musicien [idMusicien=" + idMusicien + ", nomMusicien=" + nomMusicien + ", instrument=" + instrument
				+ ", salaire=" + salaire + ", experienceYear=" + experienceYear + "]";
	}

	public Musicien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}


