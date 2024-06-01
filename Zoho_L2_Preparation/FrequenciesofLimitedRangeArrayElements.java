/*
Given an array arr[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. 

Example 1:

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
Example 2:

Input:
N = 4
arr[] = {3,3,3,3}
P = 3
Output:
0 0 4 0
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.
4 occurring 0 times.
*/
class FrequenciesofLimitedRangeArrayElements{
	static void findFrequenciesofLimitedRangeArrayElements(int n,int arr[]){
		int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                freq[arr[i]]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(freq[i] + " ");
        }
	}
	public static void main(String[] args) {
		int N = 5;
		int arr[] = {2, 3, 2, 3, 5};
		findFrequenciesofLimitedRangeArrayElements(N,arr);
	}
}