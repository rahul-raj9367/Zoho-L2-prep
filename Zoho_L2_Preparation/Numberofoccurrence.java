/*
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.
*/
class Numberofoccurrence{
	static int findfirstoccurrence(int arr[],int n,int x){
		int low=0,high=n-1;
		int firocc=-1;
		while(low<=high){
			int mid=(low+high)/2;

			if(arr[mid]==x){
				firocc=mid;
				high=mid-1;
			}else if(arr[mid]<x){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return firocc;
	}
	static int findsecondoccurrence(int arr[],int n,int x){
		int low=0,high=n-1;
		int secocc=-1;
		while(low<=high){
			int mid=(low+high)/2;

			if(arr[mid]==x){
				secocc=mid;
				low=mid+1;
			}else if(arr[mid]<x){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return secocc;
	}
	static int findNumberofoccurrence(int arr[],int n,int x){
		int first=findfirstoccurrence(arr,n,x);
		if(first==-1){
			return 0;
		}
		int second=findsecondoccurrence(arr,n,x);

		return second-first+1;
	}
	public static void main(String[] args) {
		int N = 7, X = 2;
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		System.out.println(findNumberofoccurrence(arr,N,X));
	}
}
/*
4
*/