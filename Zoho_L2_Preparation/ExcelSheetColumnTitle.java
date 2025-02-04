/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
*/
class ExcelSheetColumnTitle{
	static String findExcelSheetColumnTitle(int n){
		StringBuilder sb=new StringBuilder();

		while(n>0){
			n--;
			int r=n%26;
			char ch=(char)('A'+r);
			sb.insert(0,ch);
			n=n/26;
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		int n=28;
		System.out.println(findExcelSheetColumnTitle(n));
	}
}