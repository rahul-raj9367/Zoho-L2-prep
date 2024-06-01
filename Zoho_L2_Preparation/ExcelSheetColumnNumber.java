/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

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

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
*/
class ExcelSheetColumnNumber{
	static int findExcelSheetColumnNumber(String s){
		int n=s.length();
		int sum=0;
		int power=0;
		for(int i=n-1;i>=0;i--){
			int temp=s.charAt(i)-64;
			sum=sum+(int)Math.pow(26,power++)*temp;
			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		String columnTitle = "AB";
		System.out.println(findExcelSheetColumnNumber(columnTitle));
	}
}
/*
OUTPUT
28
*/