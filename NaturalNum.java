import java.util.*;
class NaturalNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int nth = sc.nextInt();
		FindSum obj= new FindSum();
		System.out.println("The sum is : " + obj.CalculateSum(nth));
	}
}
class FindSum{
	public int CalculateSum(int n){
		int sum1 = ((n/3)*((2*3 + (n/3-1)*3))/2);
		int sum2 = ((n/5)*((2*5) + (n/5-1)*5)/2);
        int sum3 = ((n/15)*((2*15) + (n/15-1)*15)/2);
		int sum = sum1+sum2-sum3;
		return sum;
}
}