package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAssignedDAO;
import com.example.demo.dto.Assigned;

@Service
public class AssignedServiceImpl implements IAssignedService{
	
	@Autowired
	IAssignedDAO iAssignedDAO;

	@Override
	public List<Assigned> listAllAssigned() {
		
		return iAssignedDAO.findAll();
	}

	@Override
	public Assigned saveAssigned(Assigned a) {
		
		return iAssignedDAO.save(a);
	}

	@Override
	public Assigned assignedById(Long id) {
		
		return iAssignedDAO.findById(id).get();
	}

	@Override
	public Assigned updateAssigned(Assigned a) {
		
		return iAssignedDAO.save(a);
	}

	@Override
	public void deleteAssigned(Long id) {
		iAssignedDAO.deleteById(id);
		
	}

}
