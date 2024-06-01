/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
*/
class ReverseOnlyLetters{
	static String findReverseOnlyLetters(String s){
		int i=0;
		int j=s.length()-1;
		char ch[]=s.toCharArray();

		while(i<=j){
			if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}else if(!Character.isLetter(ch[i])){
				i++;
			}else if(!Character.isLetter(ch[j])){
				j--;
			}
		}

		return new String(ch);
	}
	public static void main(String[] args) {
		String s = "ab-cd";
		System.out.println(findReverseOnlyLetters(s));
	}
}
/*
dc-ba
*/