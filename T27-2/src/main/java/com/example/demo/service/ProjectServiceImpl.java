package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProjectDAO;
import com.example.demo.dto.Project;

@Service
public class ProjectServiceImpl implements IProjectService{

	@Autowired
	IProjectDAO iProjectDAO;

	@Override
	public List<Project> listAllProjects() {
		
		return iProjectDAO.findAll();
	}

	@Override
	public Project saveProject(Project p) {

		return iProjectDAO.save(p);
	}

	@Override
	public Project projectById(Long id) {
		
		return iProjectDAO.findById(id).get();
	}

	@Override
	public Project updateProject(Project p) {
		
		return iProjectDAO.save(p);
	}

	@Override
	public void deleteProject(Long id) {
		iProjectDAO.deleteById(id);
	}
}
