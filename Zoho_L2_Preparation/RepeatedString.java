/*
There is a string S, of lowercase English letters, that is repeated infinitely many times. Given an integer N, find and print the number of letter a's in the first N letters of the infinite string.
Note: You should solve this without using any extra memory
Sample Input 1
aba
10
Sample Output 1
7
Sample Input 2
abcac
10
Sample Output 2
4
*/
class RepeatedString{
	static long findRepeatedString(String s,long n){
		long countAns=0;
		int lengthofS=s.length();

		for(int i=0;i<lengthofS;i++){
			if(s.charAt(i)=='a'){
				countAns++;
			}
		}


		long fullrepetation=n/lengthofS; //10/3 =3
		long totalAns=countAns*fullrepetation;// 2*3=6
		long remainder=n%lengthofS;//10%3=1
		for(int i=0;i<remainder;i++){
			if(s.charAt(i)=='a'){
				totalAns++;//6+1=7
			}
		}

		return totalAns;
	}
	public static void main(String[] args) {
		String s="aba";
		long n=10;
		System.out.println(findRepeatedString(s,n));
	}
}
/*
output
7
*/