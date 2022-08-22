package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Assigned;

public interface IAssignedService {
	
	/**
	 * Lists all the Assigns
	 * @return
	 */
	public List<Assigned> listAllAssigned();
	
	/**
	 * Saves an Assign
	 * @param a
	 * @return
	 */
	public Assigned saveAssigned(Assigned a);
	
	/**
	 * Gets the Assigned by ID
	 * @param id
	 * @return
	 */
	public Assigned assignedById(Long id);
	
	/**
	 * Updates the Assigned
	 * @param a
	 * @return
	 */
	public Assigned updateAssigned(Assigned a);
	
	/**
	 * Deletes the Assigned
	 * @param id
	 */
	public void deleteAssigned(Long id);

}