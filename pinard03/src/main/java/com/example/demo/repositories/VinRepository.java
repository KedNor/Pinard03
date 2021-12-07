package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Vin;

@Repository
public interface VinRepository extends JpaRepository<Vin, Integer> {

}
