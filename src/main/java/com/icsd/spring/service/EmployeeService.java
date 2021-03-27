package com.icsd.spring.service;

import org.springframework.http.ResponseEntity;

import com.icsd.spring.dto.ApiResponse;

public interface EmployeeService {

	ResponseEntity<ApiResponse> getAllProjectsOfEmployee(Long employeeId);
	ResponseEntity<ApiResponse> getAllEmployeesOfProject(Long projectId);
	
}
