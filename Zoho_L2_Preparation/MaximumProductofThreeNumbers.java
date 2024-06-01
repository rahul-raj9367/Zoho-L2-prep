/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
*/
import java.util.*;
class MaximumProductofThreeNumbers{
	static int findMaximumProductofThreeNumbers(int nums[]){
		Arrays.sort(nums);
		int product=1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length-2;i++){
			int j=i+1;
			int last=nums.length-1;
			while(j<last){
				product=nums[i]*nums[j]*nums[last];
				max=Math.max(max,product);
				if(product<0){
					j++;
				}else{
					last--;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		System.out.println(findMaximumProductofThreeNumbers(nums));
	}
}
/*
24
*/