package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Project;

public interface IProjectService {
	/**
	 * Lists all the Project
	 * @return
	 */
	public List<Project> listAllProjects();
	
	/**
	 * Saves a Project
	 * @param p
	 * @return
	 */
	public Project saveProject(Project p);
	
	/**
	 * Gets the Project by ID
	 * @param id
	 * @return
	 */
	public Project projectById(Long id);
	
	/**
	 * Updates the Project
	 * @param p
	 * @return
	 */
	public Project updateProject(Project p);
	
	/**
	 * Deletes the Project
	 * @param id
	 */
	public void deleteProject(Long id);
}
