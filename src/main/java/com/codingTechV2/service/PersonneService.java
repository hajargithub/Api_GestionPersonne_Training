package com.codingTechV2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingTechV2.entity.Personne;
import com.codingTechV2.repository.IPersonneRepository;

@Service
public class PersonneService implements IPersonneService{
	@Autowired
	private IPersonneRepository personneRepository;

	@Override
	public Personne ajouter(Personne p) {
		return personneRepository.save(p);
	}

	@Override
	public Personne selecOne(long id) {
		// TODO Auto-generated method stub
		return personneRepository.findById(id).get();
	}

	@Override
	public List<Personne> selectAll() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public void supprimer(long id) {
		// TODO Auto-generated method stub
		personneRepository.deleteById(id);
		
	}

	@Override
	public void modifier(Personne p) {
		// TODO Auto-generated method stub
		personneRepository.save(p);
		
	}
	public List <Personne> findByNameStartWith(String prefix) {
		return personneRepository.findByNameStartingWith(prefix);
		
	}
	public List <Personne> findByAgeGreaterThanEqual(int age) {
		return personneRepository.findByAgeGreaterThanEqual(age);
		
	}
	

	

	

	

}
