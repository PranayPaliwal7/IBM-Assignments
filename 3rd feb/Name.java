import java.util.*;
class Name{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee's first Name");
		String fn=sc.nextLine();
		System.out.println("Enter Employee's Last Name");
		String ln=sc.nextLine();
		try{
			if(fn.length()==0 || ln.length()==0){
			throw new MyException("Enter the Name correctly");
		}
	}
		catch(MyException e){
				System.out.println("Enter the name correctly");
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