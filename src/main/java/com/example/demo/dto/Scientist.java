package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="scientists")
public class Scientist {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String DNI;
	
	@Column(name="name_surname")
	private String nameSurname;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Assigned> assigned;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Scientist () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param dNI
	 * @param nameSurname
	 * @param assigned
	 */
	public Scientist(Long id, String dNI, String nameSurname, List<Assigned> assigned) {
		this.id = id;
		DNI = dNI;
		this.nameSurname = nameSurname;
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
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @return the nameSurname
	 */
	public String getNameSurname() {
		return nameSurname;
	}

	/**
	 * @param nameSurname the nameSurname to set
	 */
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	/**
	 * @param assigned the assigned to set
	 */
	public void setAssigned(List<Assigned> assigned) {
		this.assigned = assigned;
	}
	
	/**
	 * @return the assignations
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Assigned")
	public List<Assigned> getAssigned() {
		return assigned;
	}
}