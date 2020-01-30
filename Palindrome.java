import java.util.*;
class Palindrome{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The String");
      String str=sc.nextLine();
      char[] arr=str.toCharArray();
      boolean flag=true;
      int i=0; int j=len-1;
      while(i<j){
      	if(arr[i]!=arr[j]){
      		flag=false;
      		break;
      	}
      	else{
      		i++;
      		j--;
      	}
      }
      if(flag==true){
      	System.out.println("The String is Palindrome");
      }
      else{
      	System.out.println("The String is Not a Palindrome");
      }
	}
}