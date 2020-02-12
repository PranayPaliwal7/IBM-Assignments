package com.ibm.eis.dao;
import com.ibm.eis.bean.*;

import java.util.List;
import java.util.ArrayList;

public interface EmployeeDaoInterface {

	void storeIntoMap(Employee employee);
	List<Employee> displayEmployees();
//	ArrayList<Employee> list = new List<>();
}
