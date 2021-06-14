package com.cg.trg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.trg.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{

	@Override
	public Employee getEmployeeById(Integer empno) throws SQLException {
		try (
			 Connection connection= PostgreConnection.getConnection();
			 PreparedStatement preparedStatement= 
					 connection.prepareStatement(QueryMapper.EMP_SELECT_BYID);
				
		) {
			preparedStatement.setInt(1, empno);
			//either 0 or 1 row will be fetched from database and stored in ResultSet object
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				Employee employee= new Employee();
				employee.setEmpno(resultSet.getInt("empno"));
				employee.setEname(resultSet.getString("ename"));
				//convert java.sql.Date to java.time.LocalDate
				employee.setHiredate(resultSet.getDate("hiredate").toLocalDate());
				employee.setJob(resultSet.getString("job"));
				employee.setSal(resultSet.getDouble("sal"));
				employee.setDeptno(resultSet.getInt("deptno"));
				return employee;
			}else {
				throw new SQLException("Invalid Empno");
			}
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		try (
				 Connection connection= PostgreConnection.getConnection();
				 PreparedStatement preparedStatement= 
						 connection.prepareStatement(QueryMapper.EMP_SELECT_ALL);
					
			) {
				
				//either 0 or many rows will be fetched from database and stored in ResultSet object
				ResultSet resultSet= preparedStatement.executeQuery();
				List<Employee> employeeList= new ArrayList<>();
				while(resultSet.next()) {
					Employee employee= new Employee();
					employee.setEmpno(resultSet.getInt("empno"));
					employee.setEname(resultSet.getString("ename"));
					//convert java.sql.Date to java.time.LocalDate
					employee.setHiredate(resultSet.getDate("hiredate").toLocalDate());
					employee.setJob(resultSet.getString("job"));
					employee.setSal(resultSet.getDouble("sal"));
					employee.setDeptno(resultSet.getInt("deptno"));
					employeeList.add(employee);					
				}
				if(employeeList.size()==0) {
					throw new SQLException("Table is empty");
				}
				return employeeList;
			}catch(SQLException e) {
				throw e;
			}catch(Exception e) {
				throw e;
			}
	}

	@Override
	public String addEmployee(Employee employee) throws SQLException {
		try(
			 Connection connection= PostgreConnection.getConnection();
			 PreparedStatement preparedStatement = 
					 			connection.prepareStatement(QueryMapper.EMP_INSERT);
			){
			preparedStatement.setInt(1, employee.getEmpno());
			preparedStatement.setString(2, employee.getEname());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(3, java.sql.Date.valueOf(employee.getHiredate()));
			preparedStatement.setString(4, employee.getJob());
			preparedStatement.setDouble(5, employee.getSal());
			preparedStatement.setInt(6, employee.getDeptno());			
			/*
			 * Same method, executeUpdate() is used for SQL insert/update/delete operations
			 */
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Invalid data. Unable to add employee");
			}
			
			return "Employee Added";
			
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
		
	}

	@Override
	public String updateEmployee(Employee employee) throws SQLException {
		try(
				 Connection connection= PostgreConnection.getConnection();
				 PreparedStatement preparedStatement = 
						 			connection.prepareStatement(QueryMapper.EMP_UPDATE_SAL);
				){
				preparedStatement.setDouble(1,employee.getSal());
				preparedStatement.setInt(2, employee.getEmpno());
				
				int n= preparedStatement.executeUpdate();				
				if(n==0) {
					throw new SQLException("Invalid data. Unable to update employee salary");
				}
				
				return "Employee:"+ employee.getEmpno()+" Salary Is Updated";
				
			}catch(SQLException e) {
				throw e;
			}catch(Exception e) {
				throw e;
			}
	}

	@Override
	public String deleteEmployee(Integer empno) throws SQLException {
		try(
				 Connection connection= PostgreConnection.getConnection();
				 PreparedStatement preparedStatement = 
						 			connection.prepareStatement(QueryMapper.EMP_DELETE_BYID);
				){				
				preparedStatement.setInt(1, empno);				
				int n= preparedStatement.executeUpdate();				
				if(n==0) {
					throw new SQLException("Invalid Empno");
				}
				
				return "Employee:"+ empno+" is deleted";
				
			}catch(SQLException e) {
				throw e;
			}catch(Exception e) {
				throw e;
			}
	}

}
