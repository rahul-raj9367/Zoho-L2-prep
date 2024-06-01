/*
write program a1b3c3 output abbbccc
*/
class ExpandString {
	static String findExpandString(String s){

		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()){
			StringBuilder letters = new StringBuilder();
            while (i < s.length() && Character.isLetter(s.charAt(i))) {
                letters.append(s.charAt(i));
                i++;
            }

            // Collect the digits
            StringBuilder digits = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                digits.append(s.charAt(i));
                i++;
            }

            // Convert the digits to an integer
            int count = Integer.parseInt(digits.toString());

            // Append the letters 'count' times
            for (int k = 0; k < count; k++) {
                sb.append(letters);
            }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		String s1="a1b2c3";
		System.out.println(findExpandString(s1));


		String s="aa3b10";
		System.out.println(findExpandString(s));

		String ss="b3c6d15";
		System.out.println(findExpandString(ss));
	}
}