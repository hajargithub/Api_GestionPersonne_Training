package com.codingTechV2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import com.codingTechV2.entity.Personne;
import com.codingTechV2.entity.PersonneDTO;
import com.codingTechV2.service.IPersonneService;

import java.util.List;

@RestController
@RequestMapping("/personnes")
@CrossOrigin("http://localhost:3000")
public class PersonneController {
    @Autowired
    IPersonneService personneService;
    @Autowired
    MappingJackson2HttpMessageConverter ms;

    @GetMapping("")
    public List<Personne> getAllPersonne() {
        return personneService.selectAll();
    }

    @GetMapping("/{id}")
    public Personne getOnePersonne(@PathVariable long id) {
        return personneService.selecOne(id);
    }
    @PostMapping(value="/add")
    public Personne addPersonne(@RequestBody PersonneDTO personneDto) {
        Personne personne = new Personne();
        personne.setName(personneDto.getName());
        personne.setAge(personneDto.getAge());
       return personneService.ajouter(personne);
    }
    @DeleteMapping("/{id}")
	public void supprimer(@PathVariable long id)
	{
    	personneService.supprimer(id);
	}
    @PutMapping("/{id}")
	public void modifier(@PathVariable long id,@RequestBody PersonneDTO p)
	{
		Personne p2= personneService.selecOne(id);
		if(p2!=null)
		{ System.out.println(p2.getAge());
		System.out.println(p.getAge());
			p2.setName(p.getName());
			p2.setAge(p.getAge());
			personneService.modifier(p2);
		}
	}
	@PatchMapping("{id}")
	public void modifier(@PathVariable("id") int id,@RequestBody PersonneDTO p)
	{
		Personne p2= personneService.selecOne(id);
		if(p.getName()!=null)
		{
			p2.setName(p.getName());
		}
		if(p.getAge()!=0)
		{
			p2.setAge(p.getAge());
		}
		personneService.modifier(p2);

		
	}
	


}
