import java.util.*;
class PositiveString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String")
		String str=sc.next();
        CheckString obj= new CheckString();
        System.out.println("Is the String a Positive String?" + obj.verify(str));
	}
}
class CheckString{
	public boolean verify(String st){
         // char[] arr=new char[st.length()];
         // for(int i=0;i<arr.length;i++){
         // 	arr[i]=st.charAt(i);
         boolean flag =true;
         // }
		int []arr = new int[st.length()];
		for(int i=0;i<st.length();i++){
			arr[i]=st.charAt(i);
		}

         for(int i=1;i<arr.length;i++){
         	if(arr[i-1]>arr[i]){
         		flag=false;
         	}
         	else{
         		flag=true;
         	}
         }
         return flag;


	}
}