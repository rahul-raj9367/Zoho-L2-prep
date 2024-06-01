/*
Given an integer num, return a string of its base 7 representation.
Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 
*/
class Base7{
	static String findBase7(int num){
		// return Integer.toString(num,7);
		if(num==0)
            return "0";
        String s="";
        String o="-";
        int y=num;
        num=Math.abs(num);
        while(num>0){
            s+=num%7;
            num/=7;
        }
        StringBuilder k=new StringBuilder();
        k.append(s);
        String z=String.valueOf(k.reverse());
        o+=z;
        if(y<0)
            return o;
        return z;
	}
	public static void main(String[] args) {
		int num=100;
		System.out.println(findBase7(num));
	}
}
/*
202
*/