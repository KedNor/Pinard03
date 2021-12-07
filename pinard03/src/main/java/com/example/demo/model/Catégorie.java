package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Catégorie {
	
	@Id
	private Integer code; 
	
	@Column(name = "libcat", length = 25)
	private String libelle;

		
	public Catégorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Catégorie(Integer code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
