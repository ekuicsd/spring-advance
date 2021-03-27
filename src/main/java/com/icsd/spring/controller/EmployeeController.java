package com.icsd.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.spring.dto.ApiResponse;
import com.icsd.spring.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(value="/")
	public String check() {
		return "Server Worked!";
	}
	
	@GetMapping(value="/getAllProjectsOfEmployee/{id}")
	public ResponseEntity<ApiResponse> getAllProjectsOfEmployee(@PathVariable("id") Long employeeId) {
		return employeeService.getAllProjectsOfEmployee(employeeId);
	}
	
	@GetMapping(value="/getAllEmployeesOfProject")
	public ResponseEntity<ApiResponse> getAllEmployeesOfProject(@RequestParam("id") Long projectId) {
		return employeeService.getAllEmployeesOfProject(projectId);
	}

}
