import java.util.*;
class StringAlpha{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String str[] = new String[size];
		for(int i = 0 ; i < str.length ; i++)
		{
			str[i] = sc.nextLine();
		}
		for(int i = 0 ; i < str.length ; i++)
		{
			str[i] = str[i].toLowerCase();
		}
      Arrays.sort(str);
      if(size%2==0)
      {
	      for(int i = 0 ; i < size/2 ; i++)
	      {
	      	str[i] = str[i].toUpperCase();
	      }
	      for(int i = size/2 ; i < size; i++)
	      {
	      	str[i] = str[i].toLowerCase();
	      }
      }
      else
      {
      	for(int i = 0 ; i < (size/2)+1 ; i++)
      	{
      		str[i] = str[i].toUpperCase();
      	}
      	for(int i = (size/2)+1 ; i<size ; i++)
      	{
      		str[i] = str[i].toLowerCase();
      	}
      }
      for(int i = 0 ; i < size ; i++)
      {
      	System.out.print(str[i]+" ");
      }
	}
}