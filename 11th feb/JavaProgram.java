package  com.ibm.eis.ui;
import com.ibm.eis.service.*;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.*;
import java.util.Scanner;

public class JavaProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	EmployeeServiceInterface service=
			new EmployeeServiceClass();
	String name;
	int id;
	int salary;
	String design;
	while(true) {

	System.out.println("Press 0 to exit");
	int n1 = sc.nextInt();
	if(n1==0) {
		break;
	}
	else {
		System.out.println("Enter the name of the employee");
		name = sc.next();
		System.out.println("Enter the employee id");
	    id=sc.nextInt();
		System.out.println("Enter the salary");
	    salary=sc.nextInt();
		System.out.println("Enter the designation");
		design=sc.next();
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		//employee.setDesignation(design);
		employee.setDesignation(service.Designation(salary));
		employee.setScheme(service.InsuranceScheme(salary));
		service.storeIntoMap(employee);
       System.out.println(service.InsuranceScheme(salary));
//		System.out.println(service.Designation(salary));
	}
	}
	

	
	
	//employee.setScheme(service.InsuranceScheme(salary));
	
	System.out.println(service.displayEmployees());
	
}
}
