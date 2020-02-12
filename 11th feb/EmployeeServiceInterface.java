package com.ibm.eis.service;
import java.util.List;
import java.util.ArrayList;

import com.ibm.eis.bean.*;
import com.ibm.eis.dao.*;

public interface EmployeeServiceInterface {
	String Designation(int salary);
	String InsuranceScheme(int salary);
	void storeIntoMap(Employee employee);
	//public abstract
	List<Employee> displayEmployees();
	
}
