package Arrays;

import java.util.Scanner;

public class rotate_array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//rotate(arr, k,n);
		Rotate_by_REVERSAL_ALGO(arr,k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

public static void Rotate_by_REVERSAL_ALGO(int[] arr, int k) {
	//OPTIMISE/ REVERSAL ALGO
	
		int n=arr.length;
		k=k%n;
		reverse_in_range(arr, n-1, k);
		reverse_in_range(arr, n-1-k, 0);
		reverse_in_range(arr, 0, n-1);
	}

//BRUTE FORCE
	private static void rotate(int[] arr, int k,int n) {
		k=k%n;//kitne bhi rotation ho modulo kr dege
		
		for(int j=0;j<k;j++) {//loop for k rotation
		int temp=arr[n-1];// n=arr.length
		for(int i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];   //loop for single rotation
		}
		arr[0]=temp;
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
	
	
	
	
	
	
	
}
