package Arrays;

import java.util.Scanner;

public class create_subarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		subarrayprint(arr,n);

	}

	private static void subarrayprint(int[] arr, int n) {
		//int n=arr.length;
		for (int i=0; i <n; i++) //This loop will select start element
		{
		for (int j=i; j<n; j++)   //This loop will select end element
		{
		for (int k=i; k<=j; k++) //This loop will print element from start to end
		 
		{
		System.out.print( arr[k]+" ");
		}
		System.out.println();
		}
		}
		
	}

}
