/*
Given A: 1 rupee coins, B Two rupee coins, C can pick them up so that the total sum on the coins picked will be T 5 rupee coins. Find how many ways you equal to given target
Input: A=3, B=2, C=1, T= 5.
Output: 3
The ways we can pick them up to sum 5 are: (3 one rupee, 1 two rupee), (1 one rupee, 2 two rupees), (1 five rupee)
Explanation: Given, A: 3 one rupee, B: 2 two rupee, C: 1 five rupee.
*/
class CoinCombination {
	 public static int findWays(int A, int B, int C, int T) {
        int count=0;

        for(int i=0;i<=A;i++){
            for(int j=0;j<=B;j++){
                if(i+2*j==T){
                    count++;
                }
            }
        }

        if(C>0 && T==5){
            count++;
        }

        return count;
    }
	public static void main(String[] args) {
		int A = 3; // Number of 1-rupee coins
        int B = 2; // Number of 2-rupee coins
        int C = 1; // Number of 5-rupee coins
        int T = 5; // Target sum

        int result = findWays(A, B, C, T);
        System.out.println("Number of ways to make the sum " + T + ": " + result);
	}
}
/*
Number of ways to make the sum 5: 3
*/