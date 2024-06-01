/*

*/
class CenterAlignText{
	static String findCenterAlignText(String s,int width){
		StringBuilder sb=new StringBuilder();

		int totalspace=width-s.length();
		int leftspace=totalspace/2;
		int rightspace=totalspace-leftspace;

		for(int i=0;i<leftspace;i++){
			sb.append(' ');
		}

		for(int i=0;i<s.length();i++){
			sb.append(s.charAt(i));
		}

		for(int i=0;i<rightspace;i++){
			sb.append(' ');
		}

		return sb.toString();

	}
	public static void main(String[] args) {
		String arr[]={"This", "is", "an", "example", "of", "text", "justification"};
		int maxWidth=16;

		for(String s:arr){
			System.out.println(findCenterAlignText(s,maxWidth));
		}
	}
}