/*
Input : Madam Arora teaches malayalam
Output : 3
The string contains three palindrome words (i.e.,
Madam, Arora, malayalam) so the count is three.

Input : Nitin speaks malayalam
Output : 2
The string contains two palindrome words (i.e.,
Nitin, malayalam) so the count is two.
*/
class Countpalindromewordsinasentence{
	static int countpalindromewordsinasentence(String words[]){
		int count=0;

		for(String word:words){
			if(checkpali(word)){
				count++;
			}
		}

		return count;
	}
	static boolean checkpali(String s){
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		//madam
		while(i<=j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
	public static void main(String[] args) {
		String words[]={"Nitin","speaks","malayalam"};
		System.out.println(countpalindromewordsinasentence(words));
	}
}