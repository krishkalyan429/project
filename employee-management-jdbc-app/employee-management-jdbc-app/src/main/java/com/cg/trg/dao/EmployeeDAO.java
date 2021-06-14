package com.cg.trg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.trg.bean.Employee;
//abstract methods to perform CRUD operations
public interface EmployeeDAO {
	public abstract Employee getEmployeeById(Integer empno) throws SQLException;
	public abstract List<Employee> getAllEmployees() throws SQLException;
	public abstract String addEmployee(Employee employee) throws SQLException;
	public abstract String updateEmployee(Employee employee) throws SQLException;
	public abstract String deleteEmployee(Integer empno) throws SQLException;
	
}
