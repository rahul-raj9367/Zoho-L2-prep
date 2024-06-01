/*
Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 

Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
*/
import java.util.*;
class Maximumofallsubarraysofsizek{
	static List<Integer> findMaximumofallsubarraysofsizek(int n,int k,int arr[]){
		List<Integer> list=new ArrayList<>();

		for(int i=0;i<=n-k;i++){
			int max=arr[i];
			for(int j=1;j<k;j++){
				max=Math.max(max,arr[i+j]);
			}
			list.add(max);
		}
		return list;
	}
	public static void main(String[] args) {
		int N = 9, K = 3;
		int arr[] ={1, 2 ,3, 1, 4,5,2,3,6};
		System.out.println(findMaximumofallsubarraysofsizek(N,K,arr));
	}
}
/*
[3, 3, 4, 5, 5, 5, 6]
*/