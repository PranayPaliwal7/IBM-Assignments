class BinaryNumbers{
	public static void main(String[] args){
	  int num=	Integer.parseInt(args[0]);
	  String str="";
	  while(num!=0)
	  {
	  	str=num%2+str;
	  	num=num/2;
	  }
	  System.out.println(str);
	}
}