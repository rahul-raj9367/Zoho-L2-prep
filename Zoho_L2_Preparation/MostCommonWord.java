/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
*/
import java.util.*;
class MostCommonWord{
	static String findMostCommonWord(String paragraph,String banned[]){
		List<String> bannedWords = Arrays.asList(banned);
	    Map<String, Integer> wordCount = new HashMap<>();
	    
	    paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
	    String[] words = paragraph.split("\\s+");
	    
	    int maxCount = 0;
	    String mostCommonWord = "";
	    
	    for (String word : words) {
	        if (!bannedWords.contains(word)) {
	            int count = wordCount.getOrDefault(word, 0) + 1;
	            wordCount.put(word, count);
	            if (count > maxCount) {
	                maxCount = count;
	                mostCommonWord = word;
	            }
	        }
	    }
	    
	    return mostCommonWord;
	}
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String  banned[] = {"hit"};
		System.out.println(findMostCommonWord(paragraph,banned));
	}
}