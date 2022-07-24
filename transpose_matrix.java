package Arrays;

import java.util.Scanner;

public class transpose_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		
		int[][]arr=new int[n][n];
		//for taking input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {//arr.length same for col bcoz n*n(square) matrix hai
				arr[i][j]=sc.nextInt();
			}
		}
		transpose(arr,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}

	}

	private static void transpose(int[][] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
	}

}
