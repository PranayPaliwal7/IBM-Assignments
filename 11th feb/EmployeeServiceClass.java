package com.ibm.eis.service;
import java.util.ArrayList;
import com.ibm.eis.bean.*;
import java.util.List;
import com.ibm.eis.dao.*;
import com.ibm.eis.ui.*;

public class EmployeeServiceClass implements EmployeeServiceInterface {

EmployeeDaoClass dao = new EmployeeDaoClass();
String a="Scheme A";
String b="Scheme B";
String c="Scheme C";
String d="No Scheme";
String design;
public String Designation(int salary) {
	if(salary>5000 && salary<20000 )
		return "System associate";
	else if(salary>=20000 && salary<40000 )
		return "Programmer";
	else if(salary>=40000 ) 
		return "Manager";
	else if(salary<5000)
		return "clerk";
	else {
		return "Error found.Try again";
	}
	
}


	public String InsuranceScheme(int salary) {
		if(salary>5000 && salary<20000 )
			return c;
		else if(salary>=20000 && salary<40000 )
			return b;
		else if(salary>=40000 ) 
			return a;
		else if(salary<5000)
			return d;
		else {
			return "Error found.Try again";
		}
		
	}
public void storeIntoMap(Employee employee){
		dao.storeIntoMap(employee);
		
	}
//	public void test(){
//		
//	}

	@Override
	public List<Employee> displayEmployees() {
		
		return dao.displayEmployees();
	}



}
