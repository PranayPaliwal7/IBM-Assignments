import java.util.*;
import java.io.*;
class Traffic{
	public static void main(String[] args) throws java.io.IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Green");
		System.out.println("2.Red");
		System.out.println("3.Yellow");
		System.out.println("ENTER THE COLOR");
		int num=sc.nextInt();
		try{
		switch(num){
			case 2:
			System.out.println("Stop!");
			break;
			case 1:
			System.out.println("Go!");
			break;
			case 3:
			System.out.println("Ready!");
			break;
			default:
                throw new java.io.IOException("Error");
}
}
catch(java.io.IOException e){
	System.out.println("Invalid color chosen");
}
		}
	}
