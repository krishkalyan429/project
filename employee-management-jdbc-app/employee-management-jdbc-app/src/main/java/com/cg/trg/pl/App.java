package com.cg.trg.pl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.cg.trg.bean.Employee;
import com.cg.trg.exception.EmployeeException;
import com.cg.trg.service.EmployeeService;
import com.cg.trg.service.EmployeeServiceImpl;

public class App {
	private static Scanner scanner= new Scanner(System.in);
	private static EmployeeService service= new EmployeeServiceImpl();

	public static void main( String[] args )    {
		try {
			while(true) {
				System.out.println("Enter 1. add 2. get employee by id  3. get all employees 4. update employee salary 5. delete employee");
				int option= Integer.parseInt(scanner.nextLine());
				switch(option) {
				case 1: Employee employee=new Employee();
				populateEmployee(employee);
				try {
					String status= service.addEmployee(employee);
					System.out.println(status);
				}catch(EmployeeException e) {
					e.printStackTrace();
				}
				break;
				case 2: try { 			
					System.out.println("Enter empno: ");
					Integer empno= Integer.parseInt(scanner.nextLine());
					employee= getEmployeeById(empno);
					System.out.println(employee);
				}catch(EmployeeException e) {
					e.printStackTrace();
				}
				break;
				case 3: try {
					List<Employee> employeeList= service.getAllEmployees();
					employeeList.stream().forEach(System.out::println);				
				}catch(EmployeeException e) {
					e.printStackTrace();
				}
				break;

				case 4: 
					try {
						System.out.println("Enter empno: ");
						Integer empno= Integer.parseInt(scanner.nextLine());
						employee= getEmployeeById(empno);
						System.out.println("Current salary is "+employee.getSal());
						System.out.println("Enter new salary: ");
						double salNew= Double.parseDouble(scanner.nextLine());
						if(salNew < employee.getSal()) {
							throw new EmployeeException("New Salary is less than existing salary");
						}
						employee.setSal(salNew);
						String status=service.updateEmployee(employee);
						System.out.println(status);
					}catch(EmployeeException e) {
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						System.out.println("Enter empno: ");
						Integer empno= Integer.parseInt(scanner.nextLine());								
						String status=service.deleteEmployee(empno);
						System.out.println(status);
					}catch(EmployeeException e) {
						e.printStackTrace();
					}
					break;
				default: System.out.println("Invalid option. Enter a digit from 1-5");	
				break;				

				}

				System.out.println("Enter y to continue else any character to stop");
				String choice=scanner.nextLine();
				if(!choice.equals("y")) {
					break;
				}

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of program");
	}

	private static Employee getEmployeeById(Integer empno) throws EmployeeException {
		Employee employee= service.getEmployeeById(empno);
		return employee;
	}

	private static void populateEmployee(Employee employee) {
		System.out.println("Enter empno: ");
		employee.setEmpno(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter employee name: ");
		employee.setEname(scanner.nextLine());
		System.out.println("Enter hiredate (yyyy-MM-dd)");
		String joindate= scanner.nextLine();
		//converting String to LocalDate
		employee.setHiredate(LocalDate.parse(joindate));
		System.out.println("Enter Job: ");
		employee.setJob(scanner.nextLine());
		System.out.println("Enter salary");
		employee.setSal(Double.parseDouble(scanner.nextLine()));
		System.out.println("Enter deptno: ");
		employee.setDeptno(Integer.parseInt(scanner.nextLine()));

	}
}
