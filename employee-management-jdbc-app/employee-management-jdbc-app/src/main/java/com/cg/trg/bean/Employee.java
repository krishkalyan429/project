package com.cg.trg.bean;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private Integer empno;
	private String ename;
	private LocalDate hiredate;
	private String job;
	private Double sal;
	private Integer deptno;
	
	
}
