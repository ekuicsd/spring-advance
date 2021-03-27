package com.icsd.spring.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.icsd.spring.dto.ApiResponse;
import com.icsd.spring.repository.EmployeeProjectRepository;
import com.icsd.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeProjectRepository employeeProjectRepo;
	
	@Autowired
	EmployeeServiceImpl(EmployeeProjectRepository employeeProjectRepo) {
		this.employeeProjectRepo = employeeProjectRepo;
	}

	@Override
	public ResponseEntity<ApiResponse> getAllProjectsOfEmployee(Long employeeId) {
		return new ResponseEntity<>(new ApiResponse(true, "Projects List" , employeeProjectRepo.findAllByEmployeeId(employeeId)), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ApiResponse> getAllEmployeesOfProject(Long projectId) {
		return new ResponseEntity<>(new ApiResponse(true, "Employees List" , employeeProjectRepo.findAllByProjectId(projectId)), HttpStatus.OK);
	}

}
