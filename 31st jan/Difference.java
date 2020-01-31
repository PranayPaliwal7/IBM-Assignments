import java.util.*;
class Difference{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(diff(scan.nextInt()));
	}
	static int diff(int n){
	int a, b, c=0; 
    a = (n * (n + 1) * (2 * n + 1)) / 6; 
    b = (n * (n + 1)) / 2;
    c = c * c; 
      
    return Math.abs(a-c);
	}
}