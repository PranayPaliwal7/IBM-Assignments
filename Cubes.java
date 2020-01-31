import java.util.Scanner;
class Cubes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
		int input = sc.nextInt();
		SumOfCubes obj = new SumOfCubes();
		System.out.println("The sum of cubes of the digits is: " + obj.FindSum(input));


	}
}
class SumOfCubes{
	public int FindSum(int num){
		int sum = 0;
		while(num>0)
		{
			int digit = num%10;
			sum+=(digit*digit*digit);
			num = num/10;
		}
		return sum;
	}
}