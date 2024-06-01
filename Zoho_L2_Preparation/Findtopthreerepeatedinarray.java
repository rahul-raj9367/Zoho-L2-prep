/*
Given an array of size N with repeated numbers, You Have to Find the top three repeated numbers. 

Note : If Number comes same number of times then our output is one who comes first in array 

Examples:  

Input : arr[] = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3} 
Output : Three largest elements are 3 16 15 
Explanation : Here, 3 comes 4 times, 16 comes 3 times, 15 comes 3 times.


Input : arr[] = {2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5} 
Output : Three largest elements are 2 3 5
*/
import java.util.*;
class Findtopthreerepeatedinarray{
	static void findtopthreerepeatedinarray(int arr[]){
		// Map<Integer,Integer> map=new HashMap<>();
		// for(int v:arr){
		// 	map.put(v,map.getOrDefault(v,0)+1);
		// }

		// for(Map.Entry<Integer,Integer> entry:map.entrySet()){
		// 	if(entry.getValue()>=3){
		// 		System.out.print(entry.getKey()+" ");
		// 	}
		// }

		int freq[]=new int[101];

		boolean first=false;
		boolean second=false;
		boolean third=false;


		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}


		for(int i=0;i<100;i++){
			if(freq[i]>=3 && first==false){
				System.out.println(i);
				first=true;
			}else if(freq[i]>=3 && second==false){
				System.out.println(i);
				second=true;
			}else if(freq[i]>=3 && third==false){
				System.out.println(i);
				third=true;
			}
		}

	}
	public static void main(String[] args) {
		int arr[] = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		findtopthreerepeatedinarray(arr);
	}
}