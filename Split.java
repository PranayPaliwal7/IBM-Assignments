import java.util.*;
class SplitString{
	static void MySplit(String str, String s){
		int len=str.length();
		ArrayList<String> list=new ArrayList<String>();
        for(int i=2;i<len-2;i++){
        if(str.substring(i,i-1)==s){
        	list.add(str.substring(0,i-1));
        }
        }
        
        //String[] StrArr = list.toArray();
        for(String st: list){
        	System.out.println(st);
        }
        
	}
}

class Split{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to split");
		String str=sc.next();
		SplitString obj=new SplitString();
		obj.MySplit(str,".");

	}
}