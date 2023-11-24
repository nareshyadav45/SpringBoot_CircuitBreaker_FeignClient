package com.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.response.EmployeeResponse;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeRest {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/fetchEmployeeById/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id){
		EmployeeResponse employee = this.employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	
	
}
