package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Project;
import com.example.demo.service.ProjectServiceImpl;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	ProjectServiceImpl projectServiceImpl;
	
	@GetMapping("/projects")
	public List<Project> getAllProjects() {
		return projectServiceImpl.listAllProjects();
	}
	
	@PostMapping("/projects")
	public Project saveProject(@RequestBody Project p) {
		return projectServiceImpl.saveProject(p);
	}
	
	@GetMapping("/projects/{id}")
	public Project getProjectById(@PathVariable(name="id") Long id) {
		return projectServiceImpl.projectById(id);
	}
	
	@PutMapping("/projects/{id}")
	public Project updateProject(@PathVariable(name="id") Long id, @RequestBody Project p) {
		Project selectedProject;
		Project updatedProject;
		
		selectedProject = projectServiceImpl.projectById(id);
		
		selectedProject.setName(p.getName());
		selectedProject.setHours(p.getHours());
		selectedProject.setAssigned(p.getAssigned());
		
		updatedProject = projectServiceImpl.saveProject(selectedProject);
		
		return updatedProject;
	}
	
	@DeleteMapping("/projects/{id}")
	public void deleteProject(@PathVariable(name="id") Long id) {
		projectServiceImpl.deleteProject(id);
	}
}
