/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/
class ReverseVowelsofaString{
	static String findReverseVowelsofaString(String s){
		char word[]=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		String vowels="aeiouAEIOU";
		while(start<end){

			while(start<end && vowels.indexOf(word[start])==-1){
				start++;
			}

			while(start<end && vowels.indexOf(word[start])==-1){
				end--;
			}

			char temp=word[start];
			word[start]=word[end];
			word[end]=temp;

			start++;
			end--;
		}

		return new String(word);
	}
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(findReverseVowelsofaString(s));
	}
}
/*
OUTPUT
holle
*/