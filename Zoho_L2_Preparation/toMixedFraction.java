/*
Given a rational number, print its corresponding equivalent mixed fraction representation.
Note: Safely assume that float's precision in C/C++ is enough to handle the given
inputs.
Sample Input 1
2.5
Sample Output 1
21/2
Sample Input 2
6.25
Sample Output 2
6 1/4
*/
class toMixedFraction {   
	// static int findGcd(int a,int b){
	// 	if(b==0){
	// 		return a;
	// 	}return findGcd(b,a%b);
	// }
	static int findGcd(int a,int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
		return b;
	}
	static String MixedFraction(double number){//2.5
		int integerPart=(int)number;//2
		double decmialPart=number-integerPart;//0.5

		if(decmialPart==0){
			return integerPart+" ";
		}

		String decmialstr=String.valueOf(decmialPart).split("\\.")[1];//5
		int decmiallength=decmialstr.length();//1
		int denominator=(int)Math.pow(10,decmiallength);//10^1
		int numerator=(int)(decmialPart*denominator);// 5

		int gcd=findGcd(numerator,denominator);
		numerator=numerator/gcd;
		denominator=denominator/gcd;

		if(integerPart!=0){
			return integerPart+" "+numerator+"/"+denominator+" ";
		}else {
			return numerator+"/"+denominator+" ";
		}

	}
    public static void main(String[] args) {
        double number1 = 2;
        System.out.println(MixedFraction(number1)); // Output: 2 1/2

        double number2 = 6.25;
        System.out.println(MixedFraction(number2)); // Output: 6 1/4

        double number3 = 0.75;
        System.out.println(MixedFraction(number3)); // Output: 3/4

        double number4 = 1.0;
        System.out.println(MixedFraction(number4)); // Output: 1
    }
}
