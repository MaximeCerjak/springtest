package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Etudiant.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {

}
