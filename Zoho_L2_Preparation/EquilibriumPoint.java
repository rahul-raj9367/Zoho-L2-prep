/*
Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 
3 
Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
Example 2:

Input:
n = 1
A[] = {1}
Output: 
1
Explanation:
Since there's only element hence its only the equilibrium point.
*/
class EquilibriumPoint{
	static int findEquilibriumPoint(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		int leftsum=0;
		int rightsum=sum;

		for(int i=0;i<arr.length;i++){
			rightsum-=arr[i];
			if(leftsum==rightsum) return i+1;
			leftsum+=arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int A[] = {1,3,5,2,2};
		System.out.println(findEquilibriumPoint(A)); 
	}
}
/*
OUTPUT
3
*/