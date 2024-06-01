/*

*/
class Sumoftwolargenumbers{
	public static void main(String[] args) {
		String X = "25", Y = "23";
		int i=X.length()-1;
		int j=Y.length()-1;
		int carry=0;
		StringBuilder sb=new StringBuilder();
		while(i>=0||j>=0 ||carry!=0){
			int digit1=(i>=0)?X.charAt(i--)-'0':0;
			int digit2=(j>=0)?Y.charAt(j--)-'0':0;
			int sum=digit1+digit2+carry;
			sb.append(sum%10);
			carry=sum/10;
		}

		sb.reverse();
		System.out.println(sb.toString());
	}
}
/*
48
*/