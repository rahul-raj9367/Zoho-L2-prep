/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/
class RotateArray{
	static void reverse(int arr[],int left,int right){
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	static void findRotateArray(int nums[],int k){
		k=k%nums.length;
		reverse(nums,0,nums.length-1-k);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
		
	}
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		findRotateArray(nums,k);
		for(int v:nums){
			System.out.print(v+" ");
		}
	}
}
/*
5 6 7 1 2 3 4
*/