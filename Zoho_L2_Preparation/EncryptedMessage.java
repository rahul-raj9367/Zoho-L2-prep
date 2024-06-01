/*
Print the encrypted message by shifting every alphabet and number by the given positions in forward circular direction. Spaces and special characters in the message should be reproduced as such in the encrypted message.
Sample Input 1:
Zoho
4
Sample Output 1: dsls
Sample Input 2:
Wake me early at 5 a.m
3
Sample Output 2: zdnh ph hduob dw 8 d.p
*/
class EncryptedMessage{
	static String findEncrytedMessage(String text, int s){
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);

			if(Character.isUpperCase(ch)){
				char shifted=(char)(((int)ch+s-65)%26+65);// In case A=65+4-65 = 4%26= 4+65 =69=E
				sb.append(shifted);
			}else if(Character.isLowerCase(ch)){
				char shifted=(char)(((int)ch+s-97)%26+97);
				sb.append(shifted);
			}else if(Character.isDigit(ch)){
				char shifted=(char)(((int)ch+s-48)%10+48);
				sb.append(shifted);
			}else{
				sb.append(ch);
			}
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		String s="Zoho";
		int n=4;
		System.out.println(findEncrytedMessage(s,n));
	}
}
/*
Dsls
Zdnh ph hduob dw 8 d.p
*/