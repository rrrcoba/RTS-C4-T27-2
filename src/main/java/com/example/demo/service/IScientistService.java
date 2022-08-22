package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Scientist;

public interface IScientistService {
	
	/**
	 * Lists all the Scientists
	 * @return
	 */
	public List<Scientist> listAllScientists();
	
	/**
	 * Saves a Scientist
	 * @param s
	 * @return
	 */
	public Scientist saveScientist(Scientist s);
	
	/**
	 * Gets the Scientist by ID
	 * @param id
	 * @return
	 */
	public Scientist scientistById(Long id);
	
	/**
	 * Updates the Scientist
	 * @param s
	 * @return
	 */
	public Scientist updateScientist(Scientist s);
	
	/**
	 * Deletes the Scientist
	 * @param id
	 */
	public void deleteScientist(Long id);

}
