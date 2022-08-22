package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Assigned;

public interface IAssignedDAO extends JpaRepository<Assigned, Long>{

}
