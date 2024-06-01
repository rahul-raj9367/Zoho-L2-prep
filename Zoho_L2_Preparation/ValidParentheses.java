/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/
import java.util.*;
class ValidParentheses{
	static boolean findValidParentheses(String s){
		Stack<Character> st=new Stack<>();
		for(char it:s.toCharArray()){
			if(it=='{' || it=='[' || it=='('){
				st.push(it);
			}else{
				if(st.isEmpty()) return false;
				char c=st.pop();
				if(it=='{' && c=='}' || it=='[' && c==']' || it=='(' && c==')'){
					continue;
				}else return false;
			}
		}

		return st.isEmpty();
	}
	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(findValidParentheses(s));
	}
}
/*
OUTPUT
true
*/