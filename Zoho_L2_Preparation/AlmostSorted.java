/*
Given an array of integers, determine whether the array can be sorted in ascending order using only one of the following operations one time. 
1.Swap two elements.   
2.Reverse one sub-segment.  
Determine whether one, both or neither of the operations will complete the task. Output is as follows. 

*/
import java.util.*;
class AlmostSorted{
	static void findAlmostSorted(List<Integer> arr){
		int left=0;
		int n=arr.size();
		int right=n-1;

		while(left<n-1 && arr.get(left)<arr.get(left+1)){
			left++;
		}

		if(left==n-1){
			System.out.println("yes");
			return;
		}

		while(right>0 && arr.get(right)>arr.get(right-1)){
			right--;
		}

		Collections.swap(arr,left,right);

		if(isSorted(arr)){
			System.out.println("yes");
			System.out.println("swap "+(left+1)+" "+(right+1));
			return;
		}

		//undo the swap
		Collections.swap(arr,left,right);

		reverse(arr,left,right);
		if(isSorted(arr)){
			System.out.println("yes");
			System.out.println("reverse "+(left+1)+" "+(right+1));
			return;
		}

		//undo the reverse
		reverse(arr,left,right);
		System.out.println("no");
	}

	static boolean isSorted(List<Integer> arr){
		for(int i=0;i<arr.size()-1;i++){
			if(arr.get(i)>arr.get(i+1)){
				return false;
			}
		}
		return true;
	}
	static void reverse(List<Integer> arr,int left,int right){
		while(left<right){
			Collections.swap(arr,left,right);
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);

		findAlmostSorted(list);
	}
}
/*
OUTPUT
yes
reverse 2 5
*/