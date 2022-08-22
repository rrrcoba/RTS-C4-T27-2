package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Scientist;
import com.example.demo.service.ScientistServiceImpl;


@RestController
@RequestMapping("/api")
public class ScientistController {
	
	@Autowired
	ScientistServiceImpl scientistServiceImpl;
	
	@GetMapping("/scientists")
	public List<Scientist> getAllScientists(){
		return scientistServiceImpl.listAllScientists();
	}
	
	@PostMapping("/scientists")
	public Scientist saveScientist(@RequestBody Scientist s) {
		return scientistServiceImpl.saveScientist(s);
	}
	
	@GetMapping("/scientists/{id}")
	public Scientist getScientistById(@PathVariable(name="id")Long id) {
		return scientistServiceImpl.scientistById(id);
	}
	
	@PutMapping("/scientists/{id}")
	public Scientist updateScientist(@PathVariable(name="id")Long id, @RequestBody Scientist s) {
		Scientist selectedScientist;
		Scientist updatedScientist;
		
		selectedScientist = scientistServiceImpl.scientistById(id);
		
		selectedScientist.setDNI(s.getDNI());
		selectedScientist.setNameSurname(s.getNameSurname());
		selectedScientist.setAssigned(s.getAssigned());
		
		updatedScientist = scientistServiceImpl.saveScientist(selectedScientist);
		
		return updatedScientist;
	}
	
	@DeleteMapping("/scientists/{id}")
	public void deleteScientist(@PathVariable(name="id")Long id) {
		scientistServiceImpl.deleteScientist(id);
	}
}
