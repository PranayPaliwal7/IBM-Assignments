import java.util.*;
class Fibonnaci throws java.io.IOException
{
	int nFib(int n)
	{
		try{
		int a = 0, b = 1, c=0;
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else if(n<0)
			throw new java.io.IOException("Error");
		else
		{
			for(int i = 2; i < n; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	catch(java.io.IOException e){
		System.out.println("Enter the correct value");
	}
	int rFib(int n)
	{
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			return rFib(n-1)+rFib(n-2);
		}
	}
}
class FibExc
{
	public static void main(String[] args)
	{
		Fibonnaci f = new Fibonnaci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Element using non-recursive method is: "+f.nFib(n));
		System.out.println("Element using recursive method is: "+f.rFib(n));
	}
}