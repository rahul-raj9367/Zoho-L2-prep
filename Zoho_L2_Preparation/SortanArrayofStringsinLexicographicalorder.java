/*
Given an array of strings arr[] of length N, the task is to sort the strings in Lexicographical order.

Examples:

Input: arr[] = {“batman”, “bat”, “apple”} 
Output: 
apple
bat 
batman
Explanation: 
The lexicographical order of string is “apple”, “bat”, “batman”

Input: arr[] = {“geeks”, “for”, “geeksforgeeks”} 
Output: 
for
geeks
geeksforgeeks

SortanArrayofStringsinLexicographicalorder
*/
class SortanArrayofStringsinLexicographicalorder{
	static void  mergeSort(String arr[],int left,int right){
		if(left<right){
			int mid=(left+right)/2;

			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);

			merge(arr,left,mid,right);
		}
	} 
	static void merge(String arr[],int left,int mid,int right){
		int n1=mid-left+1;
		int n2=right-mid;

		String leftarr[]=new String[n1];
		String rightArr[]=new String[n2];

		for(int i=0;i<n1;i++){
			leftarr[i]=arr[left+i];
		}

		for(int j=0;j<n2;j++){
			rightArr[j]=arr[mid+j+1];
		}

		int i=0,j=0,k=left;

		while(i<n1 && j<n2){

			// -1 or -2 <=0
			if(leftarr[i].compareTo(rightArr[j])<=0){
				arr[k++]=leftarr[i++];
			}else{
				arr[k++]=rightArr[j++];
			}
		}

		while(i<n1){
			arr[k++]=leftarr[i++];
		}

		while(j<n2){
			arr[k++]=rightArr[j++];
		}
	}
	public static void main(String[] args) {
		String arr[] = {"batman", "bat", "apple"};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString())
	}
}