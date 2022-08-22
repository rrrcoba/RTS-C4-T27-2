package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IScientistDAO;
import com.example.demo.dto.Scientist;

@Service
public class ScientistServiceImpl implements IScientistService{

	@Autowired
	IScientistDAO iScientistDAO;

	@Override
	public List<Scientist> listAllScientists() {
		
		return iScientistDAO.findAll();
	}

	@Override
	public Scientist saveScientist(Scientist s) {
		
		return iScientistDAO.save(s);
	}

	@Override
	public Scientist scientistById(Long id) {
		
		return iScientistDAO.findById(id).get();
	}

	@Override
	public Scientist updateScientist(Scientist s) {

		return iScientistDAO.save(s);
	}

	@Override
	public void deleteScientist(Long id) {
		iScientistDAO.deleteById(id);
	}
}
