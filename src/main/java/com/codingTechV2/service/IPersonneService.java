package com.codingTechV2.service;

import java.util.List;
import java.util.Optional;

import com.codingTechV2.entity.Personne;

public interface IPersonneService  {
	
	public Personne ajouter(Personne p);
	
	public Personne selecOne(long id);
	
	public List<Personne> selectAll();
	
	public void supprimer(long id);
	
	public void modifier(Personne p);
	
	



}
