/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/
class CheckiftheSentenceIsPangram{
	static boolean findCheckiftheSentenceIsPangram(String s){
		int freq[]=new int[26];
		for(char c:s.toCharArray()){
			freq[c-'a']++;
		}
		int count=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]>=1){
				count++;
			}
		}
		if(count==26){
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
 		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(findCheckiftheSentenceIsPangram(sentence));
	}
}
/*
true
*/