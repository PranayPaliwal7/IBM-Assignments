import java.util.Scanner;
class IncreasingNum {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();
       Verify obj=new Verify();
       System.out.println("Is it the increasing number?"+ obj.checkNumber(num));
   }
       
}
class Verify{
	public boolean checkNumber(int n){
       boolean flag = false;
       int currentDigit = n % 10;
       n = n/10;
        
       while(n>0){
           if(currentDigit <= n % 10){
               flag = true;
               break;
           }
           currentDigit = n % 10;
           n = n/10;
       }
       if(flag==true){
           return false;
       }else{
           return true;
       }
    
	}
}