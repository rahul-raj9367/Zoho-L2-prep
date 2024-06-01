/*
Demonstration
Problem

Given a list of strings separated by spaces, concatenate them and replace spaces by '.'.
Eg: Input: abc def Output: abc, def
You will enter your solution in the function named "solution" which accepts a string input and retuns a string output. An example solution for this problem in Java will be like
Contest ends in 3 hours
Submissions: 0
Max Score: 1
Rate This Challenge:
More
string solution(string inputStr) {
 return inputStr.replace('',',');
}
Demonstration Edge cases: While unspecified in the question, Number of spaces between strings can be more than 1. But the output should merge all spaces into one comma. And hence, if you submit the above code, it will fail for the hidden test case. You may try solving this on your own to familiarize with the pattern or you can go ahead to solve the other questions.
Eg: 
Input: abc d e f 
Output: abc,d,e,f

Input Format
One line of input with all strings separated by spaces.
Constraints
*/
class Demonstration{
	static String findDemonstration(String inputStr){
		// return s.trim().replaceAll("\\s+", ",");
		StringBuilder sb=new StringBuilder();
		boolean nonspace=false;
		for(int i=0;i<inputStr.length();i++){
			char ch=inputStr.charAt(i);

			if(ch!=' '){
				if(nonspace){
					sb.append(",");
				}
				sb.append(ch);
				nonspace=false;
			}else{
				nonspace=true;
			}
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		String s="abc d e f ";
		System.out.println(findDemonstration(s));
	}
}
/*
OUTPUT
abc,d,e,f
*/