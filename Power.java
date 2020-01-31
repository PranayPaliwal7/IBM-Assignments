import java.util.*;
class Power{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		System.out.println(PowerOftwo(num));
	}
	static boolean PowerOftwo(int number){

		if(number<=1){
		   return false;
		}
   
  		while(number > 1){
   			if(number % 2 != 0){
    			return false;
   			}
   			number = number / 2;
  		}
  	return true;
 	}
}