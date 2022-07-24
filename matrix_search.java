package Arrays;

import java.util.Scanner;

public class matrix_search {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);	
	
		Scanner sc1=new Scanner(System.in);	
		int n=sc1.nextInt();
		int m=sc1.nextInt();
		int[][]arr=new int[n][m];
		//for taking input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc1.nextInt();
			}
			

	}
		int item=sc1.nextInt();
		System.out.println(Staircase_search(arr,n,m,item));

}
// this method is called staircase search
	private static boolean Staircase_search(int[][] arr, int n, int m,int item) {
		int row=0; //first row
		int col=arr[0].length-1;//last column ie(0,m-1)wala element
		while(col>=0 && row<=arr.length-1 ) {
			if(arr[row][col]==item) {
				return true;
			}
			else if(arr[row][col]<item) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}
}