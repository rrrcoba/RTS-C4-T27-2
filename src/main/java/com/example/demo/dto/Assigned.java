package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="assigned")
public class Assigned {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_scientist")
	private Scientist scientist;
	
	@ManyToOne
	@JoinColumn(name="id_project")
	private Project project;
	
	
	//Constructors
	
	/**
	 * Default constructor
	 */
	public Assigned () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param scientist
	 * @param project
	 */
	public Assigned(Long id, Scientist scientist, Project project) {
		super();
		this.id = id;
		this.scientist = scientist;
		this.project = project;
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
	 * @return the scientist
	 */
	public Scientist getScientist() {
		return scientist;
	}

	/**
	 * @param scientist the scientist to set
	 */
	public void setScientist(Scientist scientist) {
		this.scientist = scientist;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}
}
