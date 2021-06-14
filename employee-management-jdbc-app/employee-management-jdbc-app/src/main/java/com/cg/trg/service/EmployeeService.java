package com.cg.trg.service;

import java.util.List;

import com.cg.trg.bean.Employee;
import com.cg.trg.exception.EmployeeException;

public interface EmployeeService {
	public abstract Employee getEmployeeById(Integer empno) throws EmployeeException;
	public abstract List<Employee> getAllEmployees() throws EmployeeException;
	public abstract String addEmployee(Employee employee) throws EmployeeException;
	public abstract String updateEmployee(Employee employee) throws EmployeeException;
	public abstract String deleteEmployee(Integer empno) throws EmployeeException;
}
