package com.codingTechV2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingTechV2.entity.Personne;

public interface IPersonneRepository extends JpaRepository<Personne, Long> {
	public List<Personne> findByNameStartingWith(String prefix);
	public List<Personne> findByAgeGreaterThanEqual(int age);

}
