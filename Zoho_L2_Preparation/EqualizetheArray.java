/*

*/
import java.util.*;
class EqualizetheArray{
	static int findEqualizetheArray(List<Integer> arr){
		Map<Integer,Integer> map=new HashMap<>();
		for(Integer num:arr){
			map.put(num,map.getOrDefault(num,0)+1);
		}

		int maxFreq=0;
		for(Integer num:map.values()){
			if(num>maxFreq){
				maxFreq=num;
			}
		}

		return arr.size()-maxFreq;
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(findEqualizetheArray(list));
	}
}