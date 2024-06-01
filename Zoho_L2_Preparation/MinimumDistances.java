/*
Given an array, the distance between two array values is the number of indices between them. Find the minimum distance between any pair of equal elements in the array If no such value exists, return -1.

Sample Input 1
6
713417

Sample Output 1
3

Sample Input 2
5
123410

Sample Output 2
-1
*/
import java.util.*;
class MinimumDistances{
	static int findMinimumDistances(List<Integer> list){
		Map<Integer,Integer> map=new HashMap<>();
		boolean found=false;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++){
			if(map.containsKey(list.get(i))){
				int distance=i-map.get(list.get(i));
				min=Math.min(min,distance);
				found=true;
			}
			map.put(list.get(i),i);
		} 
		return found?min:-1;
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(7);

		System.out.println(findMinimumDistances(list));

	}
}