package Arrays;

import java.util.*;

public class reverse_array {
//Two pointer approach
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//certain index mei reverse k liye
		int m=sc.nextInt();
		int s=sc.nextInt();
		//certain index mei reverse k liye
		reverse_in_range(arr,m,s);
		
		//reverse(arr);
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

public static void reverse_in_range(int[] arr, int m, int s) {
	//certain index mei reverse k liye
			
	int i=m;  
	int j=s;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
}

public static void reverse(int[] arr) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
	
}
}
