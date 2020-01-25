class Fibonaci{
	public static void main(String[] args){
	int sum,num1=0,num2=1;
	System.out.print("1"+" ");
	      for(int i=2;i<=89;i++){
	      	sum=num1+num2;
	      	System.out.print(sum + " ");
	      	num1=num2;
	      	num2=sum;

                    
	      }
	}
}