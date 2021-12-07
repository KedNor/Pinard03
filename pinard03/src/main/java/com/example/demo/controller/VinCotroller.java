package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Catégorie;
import com.example.demo.model.Vin;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.repositories.VinRepository;


@RestController
@CrossOrigin("*")
	
public class VinCotroller {
	
	@Autowired //Important
	private VinRepository vinRepository;
	
	@Autowired //Important
	private CategorieRepository categorieRepository;
	
	
	@GetMapping("/accueil")
	@ResponseBody
	
	public String accueil() {
		
		Catégorie rouge = new Catégorie(1, "Rouge");
		Catégorie blanc = new Catégorie(2, "Blanc");
		Catégorie rose = new Catégorie(3, "rose");
		
		categorieRepository.save(rouge);
		categorieRepository.save(blanc);
		categorieRepository.save(rose);
		
		
		
		Vin v1 = new Vin(); //on crée notre produit vin a partir de notre model 
		v1.setDesignation("Bordeaux");
		v1.setPrix(15.00);
		
		vinRepository.save(v1); //Save permet de sauvegarder en base de donnée 
		
		
		Vin v2 = new Vin();
		v2.setDesignation("beaujolais");
		v2.setPrix(13.00);
		
		vinRepository.save(v2);
		
		
		
		return "<h1> Voir BD du Pinard02 </h1>";
		
		
		
	}
	
@GetMapping("/all")
	public Collection<Vin> GetAllVin () {//liste des vins qu'on a créer 
		return vinRepository.findAll(); 
	}

@GetMapping("/categorie/all")
public Collection<Catégorie> getAllCategorie(){
	return categorieRepository.findAll();
}
	
}
