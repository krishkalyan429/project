package com.cg.trg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.trg.bean.Employee;
import com.cg.trg.dao.EmployeeDAO;
import com.cg.trg.dao.EmployeeDaoImpl;
import com.cg.trg.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO = new EmployeeDaoImpl();

	@Override
	public Employee getEmployeeById(Integer empno) throws EmployeeException {
		try {
			Employee employee= employeeDAO.getEmployeeById(empno);
			return employee;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			List<Employee> employeeList= employeeDAO.getAllEmployees();
			return employeeList;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	//addEmployee() of Service layer is invoking addEmployee()of DAO layer
	@Override
	public String addEmployee(Employee employee) throws EmployeeException {
		try {
			String status=employeeDAO.addEmployee(employee);
			return status;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}		
	}

	@Override
	public String updateEmployee(Employee employee) throws EmployeeException {
		try {
			String status=employeeDAO.updateEmployee(employee);
			return status;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}		
	}

	@Override
	public String deleteEmployee(Integer empno) throws EmployeeException {
		try {
			String status=employeeDAO.deleteEmployee(empno);
			return status;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}	
	}

}
