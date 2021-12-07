package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author nourd
 *
 */

@Entity //Dire que c'est une class
public class Vin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codeProduit;
	private String designation;
	private Double prix;
	
	
	//Many Vin to One categorie
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Catégorie categorie;
	
	
	
	
	
	public Vin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Vin [codeProduit=" + codeProduit + ", designation=" + designation + ", prix=" + prix + "]";
	}

	public Vin(String designation, Double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}
	public Integer getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(Integer codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
