/*
The question is to print the square pattern with the following conditions.
1. The Inner part of the squar shoul always be "0".
2. The both diagonal of the square should be "0".
3. The Vertical and Horizontal Median should aslo be "0".
4. The Remining area of the outer layer should be "1".
The input will alway be odd number.
If the number is not odd, the code should return "-1".
Input Format
• A Number (n).
Constraints
n <= MAX(INTEGER)
Output Format
A pattern as in the question.

Sample Input 0
5

Sample Output 0
01010
10001
00000
10001
01010
Explanation 0
As the input is 5, the diagonals, middle and inner parts were printed as zeros.

Sample Input 1
7
Sample Output 1
0110110
1000001
1000001
0000000
1000001
1000001
0110110
*/
import java.util.*;
class PattenProgram5{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ||  i + j == n - 1 || i == n / 2 || j == n / 2) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        
	}
}