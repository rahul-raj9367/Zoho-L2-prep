/*
Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.

Example 1:

Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to 
zero is -68 using numbers -60 and -8.
Example 2:

Input: 
N = 6
arr[] = {-21 -67 -37 -18 4 -65}
Output: -14
Explanation: Sum of two elements closest to
zero is -14 using numbers -18 and 4.
*/
import java.util.*;
class Sumoftwoelementswithsumnearesttozero{
	static int findSumoftwoelementswithsumnearesttozero(int n,int arr[]){
		Arrays.sort(arr);
		int left=0;
		int right=n-1;
		int ans1=Integer.MIN_VALUE;
		int ans2=Integer.MAX_VALUE;
		while(left<right){
			int sum=arr[left]+arr[right];
			if(sum==0) return 0;
			if(sum<0){
				ans1=Math.max(sum,ans1);
				left++;
			}else{
				ans2=Math.min(ans2,sum);
				right--;
			}
		}

		if(ans1==Integer.MIN_VALUE && ans2!=Integer.MAX_VALUE) return ans2;
		if(ans2==Integer.MAX_VALUE && ans1!=Integer.MIN_VALUE) return ans1;

		if(Math.abs(ans1)<Math.abs(ans2)) return ans1;

		return Math.max(ans1,ans2);
	}
	public static void main(String[] args) {
		int N = 3;
		int arr[] = {-8,-66,-60};
		System.out.println(findSumoftwoelementswithsumnearesttozero(N,arr));
	}
}