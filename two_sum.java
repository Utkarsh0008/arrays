package Arrays;

import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		twosum(n,arr,target);
		

	}
	
	private static int[] twosum(int n, int[] arr, int target) {
		int[]result=new int[2];
		for(int p=0;p<n;p++) {
			for(int p1=p+1;p1<n-2;p++) {
				if(arr[p]+arr[p1]!=target) {
					
				}
				else {
					
					int j=0;
					arr[j]=p;
					arr[j+1]=p+1;
					return result;
				}
			}
		}
		return result;
		
		
	}

}
