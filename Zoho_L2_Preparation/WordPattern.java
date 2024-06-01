/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
*/
import java.util.*;
class WordPattern{
	static boolean findWordPattern(String pattern,String s){
		String word[]=s.split(" ");
		if(pattern.length()!=word.length) return false;
		HashMap<Character,String> map=new HashMap<>();

		for(int i=0;i<pattern.length();i++){
			char c=pattern.charAt(i);

			if(map.containsKey(c)){
				if(!map.get(c).equals(word[i])){
					return false;
				}
			}else{
				if(map.containsValue(word[i])){
					return false;
				}
				map.put(c,word[i]);
			}
		}

		return true;
	}
	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(findWordPattern(pattern,s));
	}
}
/*
OUTPUT
true
*/