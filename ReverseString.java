import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		String str=sc.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse + str.charAt(i);
		}
		System.out.println("The reversed string is:" + reverse);
	}
}