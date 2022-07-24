package Arrays;

import java.util.Scanner;

public class spiral_print_clockwise {

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
		spiral(arr,n,m);
		System.out.println("END");

	}

	private static void spiral(int[][] arr, int n, int m) {
		//4 poitners lege corners pr taaki print kra ke ek baar m ek line
		int minRow=0;
		int maxRow=arr.length-1;
		int minCol=0;
		int maxCol=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int count=0;// number count kre taaaki jitn elements hai waha tk hi chle loop
		
		while(count<total) {//sabko ek loop ke andar daal dia kyuki first (for) iteration mei bs boundries print hogi 
			
		
		for(int i=minCol;i<=maxCol&&count<total;i++) {//first loop minc to mac x row constant
			System.out.print(arr[minRow][i]+", ");
			count++;
		}
		minRow++;//minrow bdaege coz wo print hochuki hai aise hi neeche k loops mei chlega
		
		for(int j=minRow;j<=maxRow&&count<total;j++) {
			System.out.print(arr[j][maxCol]+", ");
			count++;
		}
		maxCol--;
		
		for(int k=maxCol;k>=minCol&&count<total;k--) {
			System.out.print(arr[maxRow][k]+", ");
		    count++;
		}
		 maxRow--;
		 
		for(int l=maxRow;l>=minRow&&count<total;l--) {
			System.out.print(arr[l][minCol]+", ");	
			count++;
		}
		minCol++;
		}
		
	}
	
	 
	 
}
