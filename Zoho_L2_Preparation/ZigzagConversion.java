/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
*/
import java.util.*;
class ZigzagConversion{
	@SuppressWarnings("unchecked")
	static String findZigzagConversion(String s,int n){
		if(n==1 || n>=s.length()) return s;

        List<Character> rows[] = new ArrayList[n];

        for(int i=0;i<n;i++){
            rows[i]=new ArrayList<>();
        }

        int index=0,d=1;
        for(char c:s.toCharArray()){
            rows[index].add(c);
            if(index==0){
                d=1;
            }else if(index==n-1){
                d=-1;
            }
            index=index+d;
        }

        StringBuilder sb=new StringBuilder();
        for(List<Character> row:rows){
            for(char c:row){
                sb.append(c);
            }
        }

        return sb.toString();


	}
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int  numRows = 3;
		System.out.println(findZigzagConversion(s,numRows));
	}
}
/*
OUTPUT
PAHNAPLSIIGYIR
*/