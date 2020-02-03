import java.util.*;
class Salary{
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Salary");
     int sal=sc.nextInt();
     try{
     	if(sal<3000){
     		throw new EmployeeException("Not Valid");
     	}
     }
     	catch(EmployeeException e){
     		System.out.println("Not Valid");
     	}
     	
	}
}
class EmployeeException extends Exception 
{ 
    public EmployeeException(String s) 
    { 
        super(s); 
    } 
} 