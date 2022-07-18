package Arrays;

import java.util.Scanner;

public class Array_product_except {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		product(arr,n);
		for(int t=0;t<arr.length;t++) {
			System.out.print(arr[t]+" ");
		}

	}

	private static int[] product(int[] arr,int n) {
		int left[]=new int[n];
		
		 left[0]=1;
		 for(int i=1;i<n;i++) {
			 left[i]=left[i-1]*arr[i-1];
		 }
		 int right[]=new int[n];
		right[n-1]=1;
		for(int j=n-2;j>=0;j--) {
			right[j]=right[j+1]*arr[j+1];
		}
		for(int f=0;f<n;f++) {
			arr[f]=left[f]*right[f];
		}
		
		return arr;
		
		
		
	}

}
