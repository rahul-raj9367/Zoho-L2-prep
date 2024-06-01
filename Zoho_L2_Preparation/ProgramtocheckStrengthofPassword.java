/*
A password is said to be strong if it satisfies the following criteria: 

It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
Its length is at least 8.
It contains at least one digit.
Given a string, find its strength. Let a strong password is one that satisfies all above conditions. A moderate password is one that satisfies first three conditions and has length at least 6. Otherwise password is week.

Examples : 
Input : "GeeksforGeeks!@12"
Output : Strong
*/
class ProgramtocheckStrengthofPassword{
	static String findProgramtocheckStrengthofPassword(String password){
		boolean hasLower=false;
		boolean hasDigit=false;
		boolean hasSpecial=false;
		boolean hasUpper=false;

		for(char ch:password.toCharArray()){
			if(Character.isDigit(ch)){
				hasDigit=true;
			}else if(Character.isUpperCase(ch)){
				hasUpper=true;
			}else if(Character.isLowerCase(ch)){
				hasLower=true;
			}else if(checkSpecialChar(ch)){
				hasSpecial=true;
			}
		}
		int count=0;
		if(hasLower) count++;
		if(hasDigit) count++;
		if(hasSpecial) count++;
		if(hasUpper) count++;

		switch(count){
			case 4:
				return "Strong";
			case 3:
                return "Good";
            case 2:
                return "Medium";
            default:
                return "Weak";
		}
	}
	static boolean checkSpecialChar(char ch){
		String special="!@#$%^&*()-+";

		return special.contains(Character.toString(ch));
	}
	public static void main(String[] args) {
		String password="Rahul@123";
		System.out.println(findProgramtocheckStrengthofPassword(password));
	}
}
/*
Strong
*/