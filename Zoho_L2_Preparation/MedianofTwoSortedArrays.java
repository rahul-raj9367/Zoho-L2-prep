/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
import java.util.*;
class MedianofTwoSortedArrays{
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
	static double findMedianofTwoSortedArrays(int nums1[],int nums2[]){
		int n=nums1.length;
		int m=nums2.length;
		int arr3[]=new int[n+m];
		int k=0;
		for(int i=0;i<n;i++){
			arr3[k++]=nums1[i];
		}
		for(int i=0;i<m;i++){
			arr3[k++]=nums2[i];
		}

		// Arrays.sort(arr3);
		mergeSort(arr3,0,arr3.length-1);
		double middle;
		if((n+m)%2==0){
			middle=(arr3[(n+m)/2-1]+arr3[(n+m)/2])/2.0;
		}else{
			middle=arr3[(n+m)/2];
		}

		return middle;
	}
	public static void main(String[] args) {
		int nums1[] = {1,3}, nums2[] = {2};
		System.out.println(findMedianofTwoSortedArrays(nums1,nums2));
	}
}
/*
OUTPUT
2.0
*/