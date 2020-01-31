import java.util.Scanner;
import java.util.StringTokenizer;

class IntegerSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers");
		String str = sc.nextLine();
		StringTokenizer Tok = new StringTokenizer(str);
		String[] stringArray = new String[100];
		int i = 0, 
		sum = 0;
		while(Tok.hasMoreTokens()){
			stringArray[i] = Tok.nextToken();
			int x  = Integer.parseInt(stringArray[i]);
			sum += x;
			i++;
		}

		System.out.println("The integers are: ");
		for(int j=0; j<i; j++){
			System.out.println(stringArray[j] + " ");
		}

		System.out.print("The sum of the integers is: " + sum);
	}
}