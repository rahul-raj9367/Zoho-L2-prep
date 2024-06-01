/*
Let the given array be arr[]. A simple solution is to create an auxiliary array temp[] which is initially a copy of arr[]. Randomly select an element from temp[], copy the randomly selected element to arr[0], and remove the selected element from temp[]. Repeat the same process n times and keep copying elements to arr[1], arr[2], … . The time complexity of this solution will be O(n^2).

Fisher–Yates shuffle Algorithm works in O(n) time complexity. The assumption here is, we are given a function rand() that generates a random number in O(1) time. The idea is to start from the last element and swap it with a randomly selected element from the whole array (including the last). Now consider the array from 0 to n-2 (size reduced by 1), and repeat the process till we hit the first element. 
*/
import java.util.*;
class ShuffleagivenarrayusingFisherYatesshuffleAlgorithm{
	static int[] findshuffleAlgorithm(int arr[]){
		Random r=new Random();

		for(int i=arr.length-1;i>=0;i--){
			int j=r.nextInt(i+1);

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

		return arr;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(findshuffleAlgorithm(arr)));
	}
}
/*
[3, 7, 1, 8, 4, 6, 10, 5, 2, 9]
*/