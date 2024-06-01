/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.


Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]
*/
import java.util.*;
class Permutations{
	static List<List<Integer>> findPermutations(int arr[]){
		List<List<Integer>> ans=new ArrayList<>();
		find(0,ans,arr);
		return ans;
	}
	static void find(int index,List<List<Integer>> ans,int arr[]){
		if(index==arr.length){
			List<Integer> ds=new ArrayList<>();
			for(int i=0;i<arr.length;i++){
				ds.add(arr[i]);
			}
			ans.add(ds);
			return;
		}
		for(int i=index;i<arr.length;i++){
			swap(i,index,arr);
			find(index+1,ans,arr);
			swap(i,index,arr);
		}
	}
	static void swap(int i,int j,int arr[]){
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		System.out.println(findPermutations(nums));
	}
}