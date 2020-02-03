import java.util.*;
class Prime{
	public static void main(String[] args) throws java.io.IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which number prime numbers are needed");
		int n,p;
		n=sc.nextInt();
		try{
		for(int i=2;i<n;i++){
		p=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
				p=1;
			}
			}
			if(p==0){
				System.out.println(i);
			}
			
			if(n<0){
				throw new java.io.IOException("Error");
			}	
		}
	}
		catch(java.io.IOException e){
			System.out.println("Number Invalid. Try Again.");
		}
		}
	
}

