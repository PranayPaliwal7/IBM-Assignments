import java.util.*;
class FindChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in which you want to search a character");
		String str=sc.nextLine();
		System.out.println("Enter the character");
        char ch =sc.next().charAt(0);
        char[] strArr =str.toCharArray();
        boolean flag=false;
        for(char val: strArr){
        	if(val==ch){
        		flag=true;
        		break;
        	}
        }
        if(flag==true){
        	System.out.println("Character Found");
        }
        else{
        	System.out.println("Character Not Found");
        }
	}
}