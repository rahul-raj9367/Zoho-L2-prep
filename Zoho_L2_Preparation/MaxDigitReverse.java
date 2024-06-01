/*
3) In a given array, find the maximum digits in the array and reverse each element such that the number of digits of each element is equal to the maximum digit found in the array.
Note: Elements should be of number/int type and not String type
Hint: If the max digit is found to be 4, the number 123 reversed to get 3210, considering 123 to be 0123.
Example 1:
Input: [1, 2, 4, 15, 8] 
*/
import java.util.Arrays;
class MaxDigitReverse{
	static int[] findMaxDigitReverse(int arr[]){
		int maxDigit=0;
		for(int num:arr){
			int value=findDigit(num);
			if(value>maxDigit){
				maxDigit=value;
			}
		}

		int result[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			result[i]=Reverse(arr[i],maxDigit);
		}

		return result;
	}
	static int findDigit(int num){
		int count=0;
		while(num!=0){
			num/=10;
			count++;
		}
		return count;
	}
	static int Reverse(int num,int digit){
		String numStr=String.valueOf(num);
		StringBuilder sb=new StringBuilder();

		for(int i=numStr.length();i<digit;i++){
			sb.append('0');
		}
		sb.append(numStr);

		sb.reverse();

		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {
		int arr[]={1,2,4,15,8};
		int result[]=findMaxDigitReverse(arr);
		System.out.println(Arrays.toString(result));
	}
}
/*
[10, 20, 40, 51, 80]
*/