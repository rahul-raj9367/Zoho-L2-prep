/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr
*/
class Reversewordsinagivenstring{
	static String findReversewordsinagivenstring(String s){
		StringBuilder sb=new StringBuilder();
		String sp[]=s.split("\\.");
		for(int i=sp.length-1;i>=0;i--){
			sb.append(sp[i]);
			if(i!=0){
				sb.append(".");
			}
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		String S = "i.like.this.program.very.much";
		System.out.println(findReversewordsinagivenstring(S));
	}
}
/*
much.very.program.this.like.i
*/