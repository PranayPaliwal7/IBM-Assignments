package com.ibm.eis.dao;
import com.ibm.eis.bean.*;
import java.util.List;
import java.util.ArrayList;

public class EmployeeDaoClass implements EmployeeDaoInterface {
	private List<Employee> Employees=new 
			ArrayList();
	
	
	public void storeIntoMap(Employee employee) {
	Employees.add(employee);
		//Employees.put(1, employee);
		
	}
	
	public List<Employee> displayEmployees(){
		return Employees;
		
	}
}