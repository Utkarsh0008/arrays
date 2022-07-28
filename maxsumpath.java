package Arrays;

import java.util.Scanner;

public class maxsumpath {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]ar1=new int[n];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		int[]ar2=new int[m];
		for(int e=0;e<ar1.length;e++) {
			ar2[e]=sc.nextInt();
		}
		path(ar1,ar2,n,m);

	}

	private static void path(int[] ar1, int[] ar2, int n, int m) {
		int p1=0;
		int p2=0;
		
		while(p1<ar1.length) {
			if(ar1[p1]>ar2[p2]) {
				//sum+=ar1[p1];
				p1++;
				
			}
			else if(ar1[p1]<ar2[p2]) {
				//sum+=ar2[p2];
				
				p2++;
			}
			else{
				int sum1=0;
				int sum2=0;
				for(int i=p1;i<n;i++) {
					sum1+=ar1[p1];
				}
				for(int j=p2;j<m;j++) {
					sum2+=ar2[p2];
				}
				if(sum1>sum2) {
					
				}
				//System.out.println(sum1);
			}
			
		}
		
		
	}

}
