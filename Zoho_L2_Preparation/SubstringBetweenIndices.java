/*
Given two strings, 
find the first occurrence of all characters of second string in the 
first string and print the characters between the least and the highest index
*/
import java.util.*;
class SubstringBetweenIndices {
  	static String findSubstring(String str1,String str2){
  		Map<Character,Integer> map =new HashMap<>();
  		int minIndex=Integer.MAX_VALUE;
  		int maxIndex=Integer.MIN_VALUE;

  		for(char ch:str2.toCharArray()){
  			int index=str1.indexOf(ch);
  			if(index==-1){
  				return "All characters of second string are not present in first string";
  			}
  			map.put(ch,index);
  		}

  		for(int val:map.values()){
  			if(val<minIndex){
  				minIndex=val;
  			}

  			if(val>maxIndex){
  				maxIndex=val;
  			}
  		}

  		return str1.substring(minIndex,maxIndex+1);
  	}
    public static void main(String[] args) {
        String str1 = "abcdefghijk";
        String str2 = "gfgk";
        System.out.println(findSubstring(str1, str2));  
    }
}
/*
fghijk
*/