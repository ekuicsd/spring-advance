package com.icsd.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.icsd.spring.model.Employee;
import com.icsd.spring.model.EmployeeProject;
import com.icsd.spring.model.Project;

@Repository
public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, Long> {

//	@Query(value="select ep.project from EmployeeProject ep where ep.employee.id = :employeeId")
//	List<Project> findAllByEmployeeId(@Param("employeeId") Long employeeId);
	List<EmployeeProject> findAllByEmployeeId(@Param("employeeId") Long employeeId);

	@Query(value="select ep.employee from EmployeeProject ep where ep.project.id = :projectId")
	List<Employee> findAllByProjectId(@Param("projectId") Long projectId);

}
