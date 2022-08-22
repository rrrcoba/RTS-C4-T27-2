package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Assigned;
import com.example.demo.service.AssignedServiceImpl;

@RestController
@RequestMapping("/api")
public class AssignedController {

	@Autowired
	AssignedServiceImpl assignedServiceImpl;

	@GetMapping("/assigned")
	public List<Assigned> getAllAssigned() {
		return assignedServiceImpl.listAllAssigned();
	}

	@PostMapping("/assigned")
	public Assigned saveAssigned(@RequestBody Assigned a) {
		return assignedServiceImpl.saveAssigned(a);
	}

	@GetMapping("/assigned/{id}")
	public Assigned getAssignedById(@PathVariable(name = "id") Long id) {
		return assignedServiceImpl.assignedById(id);
	}

	@PutMapping("/assigned/{id}")
	public Assigned updateAssigned(@PathVariable(name = "id") Long id, @RequestBody Assigned a) {
		Assigned selectedAssigned;
		Assigned updatedAssigned;

		selectedAssigned = assignedServiceImpl.assignedById(id);

		selectedAssigned.setProject(a.getProject());
		selectedAssigned.setScientist(a.getScientist());

		updatedAssigned = assignedServiceImpl.saveAssigned(selectedAssigned);

		return updatedAssigned;
	}

	@DeleteMapping("/assigned/{id}")
	public void deleteAssigned(@PathVariable(name = "id") Long id) {
		assignedServiceImpl.deleteAssigned(id);
	}
}
