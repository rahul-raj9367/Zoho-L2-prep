/*

Adding a digit to all the digits of a number 
eg digit=4, number = 2875, o/p= 612119
*/
class AddDigitToAllDigits{
	static String findAddDigitToAllDigits(int digit,int number){
		String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        for(char ch:numStr.toCharArray()){
        	int newDigit=(ch-'0')+digit;
        	result.append(newDigit);
        }

        return result.toString();
	}
	public static void main(String[] args) {
		int digit=4, number = 2875;
		System.out.println(findAddDigitToAllDigits(digit,number));
	}
}
/*
612119
*/