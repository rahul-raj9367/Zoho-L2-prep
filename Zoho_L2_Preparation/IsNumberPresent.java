/*
Check if a number ‘a’ is present in another number ‘b.
*/
class IsNumberPresent{
	static boolean isNumberPresent(int a,int b){
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);

		return s2.contains(s1);
	}
	public static void main(String[] args) {
		int a = 226;
        int b = 34722641;
        System.out.println(isNumberPresent(a, b)); // Output: true

        int a2 = 123;
        int b2 = 456789;
        System.out.println(isNumberPresent(a2, b2)); // Output: false
	}
}
/*
true
false
*/