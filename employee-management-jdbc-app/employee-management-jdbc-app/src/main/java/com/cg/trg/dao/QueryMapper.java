package com.cg.trg.dao;

public interface QueryMapper {
	public static final String EMP_INSERT= "insert into employee values(?,?,?,?,?,?)";
	public static final String EMP_SELECT_BYID= "select * from employee where empno=?";
	public static final String EMP_SELECT_ALL= "select * from employee";
	public static final String EMP_DELETE_BYID= "delete from employee where empno=?";
	public static final String EMP_UPDATE_SAL= "update employee set sal=? where empno=?";
}
