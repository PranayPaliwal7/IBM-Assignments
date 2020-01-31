import java.util.*;
class ReverseArray{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the size of input : ");
		int size = n.nextInt();
		System.out.print("Enter the elements : ");
		int[] a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = n.nextInt();
		}
		int[] ans = new ReverseArray().sortReverse(a);
		for(int i=0;i<ans.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
	}
	public int[] sortReverse(int[] array){
		int[] arr = new int[array.length];
		for(int i=0;i<array.length;i++){
			arr[i] = reverse(array[i]);
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public int reverse(int n){
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int sum = Integer.parseInt(sb.toString());
		return sum;
	}
}