/*
Luhn's algorithm
Problem


Write a program to calculate the checksum-digit of a number. It is calculated as follows:

• Calculate the position of digits. Rightmost position starts at 0, Eg: in 1234, 1 is 3rd digit, 4 is Oth digit.
• Double the digits at even positions only and subtract 9 if the result is >=10, so that it becomes a single digit. Eg: 8 will become 7, as 8*2 = 16 => 1+6 = 7. (which is also, 16-9)
• Sum all the digits (after previous step) and if the result is a multiple of 10, checksum digit will be 0. Otherwise, checksum digit is the number required to make the sum a multiple of 10.


Input Format
One line of one integer value only.
Constraints
0
Output Format
One digit that is the checksum digit of the given value.
Sample Input 0
13 
sample output 
3
*/
class LuhnsAlgorithm {
	static int calculateChecksumDigit(String input){
		int sum=0;
		boolean evenPostion=true;
		for(int i=input.length()-1;i>=0;i--){
			int digit=input.charAt(i)-'0';// Start with the rightmost position (0)

			if(evenPostion){
				digit*=2;
				if(digit>=10){
					digit-=9;
				}
			}
			sum+=digit;
			evenPostion=!evenPostion;
		}

		//formula
		int checksum=(10-(sum%10))%10;

		return checksum;
	}
	public static void main(String[] args) {
		String input="1234";
		System.out.println(calculateChecksumDigit(input));
	}
}
/*
3
*/