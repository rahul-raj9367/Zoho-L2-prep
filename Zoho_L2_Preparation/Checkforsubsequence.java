/*
Given two strings A and B, find if A is a subsequence of B.

Example 1:

Input:
A = AXY 
B = YADXCP
Output: 0 
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.
 

Example 2:

Input:
A = gksrek
B = geeksforgeeks
Output: 1
Explanation: A is a subsequence of B.
*/
class Checkforsubsequence{
	static boolean findCheckforsubsequence(String A,String B){
		int j=0;
		for(int i=0;i<B.length();i++){
			if(j<A.length() && A.charAt(j)==B.charAt(i)){
				j++;
			}
		}

		return j==A.length();
	}
	public static void main(String[] args) {
		String A = "gksrek";
		String B = "geeksforgeeks";
		System.out.println(findCheckforsubsequence(A,B));
	}
}