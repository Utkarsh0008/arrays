package Arrays;

import java.util.Scanner;

public class array_wave_print_columnwise {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]arr=new int[n][m];
		//for taking input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
			printcolumwise(arr,n,m);
	}


	private static void printcolumwise(int[][] arr, int n, int m) {
		for(int col=0;col<m;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {		
				System.out.print(arr[row][col]+", ");
				}
			}
			else {
				for(int row=arr.length-1;row>=0;row--) {		
					System.out.print(arr[row][col]+", ");
					}
			}
			
		}
		System.out.println("END");
		
	}

}
