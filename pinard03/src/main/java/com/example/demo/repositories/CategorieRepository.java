package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Catégorie;

public interface CategorieRepository extends JpaRepository<Catégorie, Integer> {

}
