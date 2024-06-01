/*
Given a string containing lower and uppercase alphabets, the task is to find the maximum number of characters between any two same (case sensitivity) character in the string.

Example 1:

Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.
Example 2:

Input: 
S = "FoR"
Output: -1
Explanation: No repeating character present.
*/
import java.util.*;
class Maximumnumberofcharactersbetweenanytwosamecharacter{
	static int findMaximumnumberofcharactersbetweenanytwosamecharacter(String s){
		HashMap<Character,Integer> map=new HashMap<>();
		int max=-1;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(map.containsKey(ch)){
				int first=map.get(ch);
				int last=i-first-1;
				max=Math.max(max,last);
			}else{
				map.put(ch,i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		String s="socks";
		System.out.println(findMaximumnumberofcharactersbetweenanytwosamecharacter(s));
	}
}
/*
4
*/