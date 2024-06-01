/*
Given an array A of N length. We need to calculate the next smallest greater element for each element in a given array. If the next greater element is not available in a given array then we need to fill -10000000 at that index place.

Example 1:

Input : arr[] = {13, 6, 7, 12}
Output : _ 7 12 13 
Explanation:
Here, at index 0, 13 is the greatest value 
in given array and no other array element 
is greater from 13. So at index 0 we fill 
'-10000000'.

Example 2:

Input : arr[] = {6, 3, 9, 8, 10, 2, 1, 15, 7} 
Output :  7 6 10 9 15 3 2 _ 8
Explanation: Here, at index 7, 15 is the greatest
value in given array and no other array element is
greater from 15. So at index 7 we fill '-10000000'.
*/
import java.util.*;
class Smallestgreaterelementsinwholearray{
	static int[] findSmallestgreaterelementsinwholearray(int arr[]){
		int temp[]=arr.clone();
		Arrays.sort(temp);// 6 7 12 13 
		for(int i=0;i<arr.length;i++){
			arr[i]=binarySearch(temp,0,arr.length-1,arr[i]);
		}

		return arr;
	}
	static int binarySearch(int arr[],int low,int high,int search){
		int ele=-10000000;
		while(low<=high){
			int mid=(low+high)/2;

			if(arr[mid]>search){
				ele=arr[mid];
				high=mid-1;
				
			}else{
				low=mid+1;
			}
		}

		return ele;
	}
	public static void main(String[] args) {
		int arr[] = {13, 6, 7, 12};
		int ans[]=findSmallestgreaterelementsinwholearray(arr);
		System.out.println(Arrays.toString(ans));
	}
}
/*
[-10000000, 7, 12, 13]
*/