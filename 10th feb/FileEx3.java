import java.io.*;
import java.util.*;
class FileEx3{
public static void main(String [] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the file name");
	String s=input.next();
	try {
      File myObj = new File(s);
      System.out.println(myObj.createNewFile());
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
      // myObj = new File(s);
		
		//System.out.println("File Name:"+myObj.getName());
		System.out.println("This file is:"+(myObj.exists()?"Exists":"Does not exists"));
		System.out.println("Is Readable:"+myObj.canRead());
		System.out.println("IS Writable:"+myObj.canWrite());
		System.out.println("File Size:"+myObj.length()+"bytes");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
     }

 	

	}}