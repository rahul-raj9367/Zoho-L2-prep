/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/
import java.util.*;
class LongestConsecutiveSequence{
	static void mergeSort(int arr[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int leftarr[]=new int[n1];
        int rightarr[]=new int[n2];

        for(int i=0;i<n1;i++){
            leftarr[i]=arr[left+i];
        }

        for(int i=0;i<n2;i++){
            rightarr[i]=arr[mid+i+1];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k++]=leftarr[i++];
            }else{
                arr[k++]=rightarr[j++];
            }
        }

        while(i<n1){
            arr[k++]=leftarr[i++];
        }

        while(j<n2){
            arr[k++]=rightarr[j++];
        }
    }
	static int findLongestConsecutiveSequence(int nums[]){
		int n=nums.length;
		if(n==0) return 0;
		else if(n==1) return 1;
		int count=1;
		int max=Integer.MIN_VALUE;
		// Arrays.sort(nums);
		mergeSort(nums,0,nums.length-1);
		int i=1;
		while(i<n){
			int j=i-1;
			if(nums[j]+1==nums[i]){
				count++;
			}else if(nums[i]!=nums[j]){
				count=1;
			}
			i++;
			max=Math.max(max,count);
		}
		return max;
	}
	public static void main(String[] args) {
		 int nums[] = {100,4,200,1,3,2};
		 System.out.println(findLongestConsecutiveSequence(nums));
	}
}
/*
OUTPUT
4
*/