/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
Sample Input
10 20 10 10 30 50 10 20 20
Sample Output
3
*/
import java.util.*;
class SalesbyMatch{
	static int findSalesbyMatch(int arr[]){
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}

		int count=0;
		for(int val:map.values()){
			count+=val/2;
		}

		return count;
	}
	public static void main(String[] args) {
		int arr[]={10,20,10,10,30,50,10,20,20};
		System.out.println(findSalesbyMatch(arr));
	}
}
/*
OUTPUT
3
*/