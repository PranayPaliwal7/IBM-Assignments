import java.util.*;
class Age{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        try{
        	if(age<15){
        		throw new MyException("Age is Not Valid");
        	}
        }
        catch(MyException e){
        	System.out.println("Age is Not Valid");
        }
	}
}

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 