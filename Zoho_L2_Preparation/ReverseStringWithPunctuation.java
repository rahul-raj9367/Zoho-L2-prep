/*
Given an input string, reverse the characters in the string, maintaining the space and other punctuation (other than alpha numeric) in the same location. Important Note: Solve the problem by navigating the array only once without using additional arrays 1) 
Input: "house! no:12" 
Output:"21one! su:oh"
21ope! su: oh
*/
class ReverseStringWithPunctuation {
	static String findReverseStringWithPunctuation(String s){
		char ch[]=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		while(left<right){

			while(left<right && !Character.isLetterOrDigit(ch[left])){
				left++;
			}

			while(left<right && !Character.isLetterOrDigit(ch[right])){
				right--;
			}

			if(left<right){
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;

				left++;
				right--;
			}
			
		}

		return new String(ch);

	}
	public static void main(String[] args) {
		String s="house! no:12";
		System.out.println(findReverseStringWithPunctuation(s));
	}
}