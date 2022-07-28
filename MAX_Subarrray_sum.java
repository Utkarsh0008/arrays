package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MAX_Subarrray_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
			
		
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(without_Kadane(arr));
		System.out.println(Kadane(arr));
	}
	

		
		private static int Kadane(int[] arr) {
			int ans=Integer.MIN_VALUE; //maximum sum ka track rkhega,inter.min is for corner case if sare -ve hue
			int prev_sum=0;
	           for (int i = 0; i < arr.length-1; i++) {
	        	  
					prev_sum+=arr[i];
					ans=Math.max(ans,prev_sum);
					if(prev_sum<0) {  // dusra loop hata dia ye condition lgayi taki -ve hote hi subarray chnge hojaye
						prev_sum=0;
					}
				
			}
	           return ans;
					
		
	}



		public static int without_Kadane(int[] arr) {
			int ans=0; //maximum sum ka track rkhega
           for (int i = 0; i < arr.length-1; i++) {
        	   int prev_sum=0; //sum ka track rkhega 
			for (int j = i; j < arr.length-1; j++) {
				prev_sum+=arr[j];
				ans=Math.max(ans,prev_sum);
			}
		}
           return ans;
				
			}
	
		}




















//int ans = Integer.MIN_VALUE;
//int prevsum = 0;
//for (int i = 0; i < arr.length; i++) {
//	prevsum += arr[i];
//	ans = Math.max(ans, prevsum);
//
//	if (prevsum < 0) {
//		prevsum = 0;
//	}
//}
//return ans;
