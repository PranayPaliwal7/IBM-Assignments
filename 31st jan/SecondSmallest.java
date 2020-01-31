import java.util.*;
class SecondSmallest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
        	arr[i]=sc.nextInt();
        }
        FindSecondSmallest obj=new FindSecondSmallest();
        System.out.println("Second Smallest element is:" + obj.getSecondSmallest(arr));
	}
}
class FindSecondSmallest{
	public int getSecondSmallest(int []array){
       Arrays.sort(array);
       int element=0;
       for(int i=0;i<array.length-1;i++){
       	if(array[i]!=array[i+1]){
       		element=array[i+1];
       		break;
       	}
       }return element;
        }  
	}
