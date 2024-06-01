/*

*/
import java.util.*;
class KeypadTranslator {
	static String findKeypadTranslator(String  input){
		Map<Character,String> map=new HashMap<>();
		map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqrs");
		map.put('8',"tuv");
		map.put('9',"wxyz");
		map.put('0'," ");

		int i=0;
		StringBuilder sb=new StringBuilder();
		while(i<input.length()){
			char currentChar=input.charAt(i);
			int count=0;

			while(i<input.length() && input.charAt(i)==currentChar){
				count++;
				i++;
			}

			if(currentChar!=0){
				String letters=map.get(currentChar);
				int index=(count-1)%letters.length();
				sb.append(letters.charAt(index));
			}else{
				sb.append(' ');
			}
		}

		return sb.toString();


	}
	public static void main(String[] args) {

		String input="44335550555666";
		System.out.println(findKeypadTranslator(input));
	}
}
/*
hel lo
*/