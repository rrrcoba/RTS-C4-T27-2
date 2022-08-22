package com.example.demo.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int hours;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Assigned> assigned;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Project () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param name
	 * @param hours
	 * @param assigned
	 */
	public Project(Long id, String name, int hours, List<Assigned> assigned) {
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.assigned = assigned;
	}


	// Getters and setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @param assigned the assigned to set
	 */
	public void setAssigned(List<Assigned> assigned) {
		this.assigned = assigned;
	}
	
	/**
	 * @return the supplies
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Assigned")
	public List<Assigned> getAssigned() {
		return assigned;
	}
}
