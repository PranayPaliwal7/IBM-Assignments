class Factorial{
	public static void main(String[] args){
	      int number = Integer.parseInt(args[0]);
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
	}
}