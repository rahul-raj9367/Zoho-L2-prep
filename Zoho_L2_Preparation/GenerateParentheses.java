/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
*/
import java.util.*;
class GenerateParentheses{
	static List<String> findGenerateParentheses(int n){
		List<String> result=new ArrayList<>();
		recursive(result,0,0,"",n);
		return result;
	}
	static void recursive(List<String> result,int left,int right,String s,int n){
		if(s.length()==n*2){
			result.add(s);
			return;
		}

		if(left<n){
			recursive(result,left+1,right,s+"(",n);
		}

		if(right<left){
			recursive(result,left,right+1,s+")",n);
		}
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println(findGenerateParentheses(n));
	}
}
/*
OUTPUT
[((())), (()()), (())(), ()(()), ()()()]
*/