/*
You are given a 0-indexed 2D integer array nums. Initially, your score is 0. Perform the following operations until the matrix becomes empty:

From each row in the matrix, select the largest number and remove it. In the case of a tie, it does not matter which number is chosen.
Identify the highest number amongst all those removed in step 1. Add that number to your score.
Return the final score.

 

Example 1:

Input: nums = [[7,2,1],[6,4,2],[6,5,3],[3,2,1]]
Output: 15
Explanation: In the first operation, we remove 7, 6, 6, and 3. We then add 7 to our score. Next, we remove 2, 4, 5, and 2. We add 5 to our score. Lastly, we remove 1, 2, 3, and 1. We add 3 to our score. Thus, our final score is 7 + 5 + 3 = 15.
Example 2:

Input: nums = [[1]]
Output: 1
Explanation: We remove 1 and add it to the answer. We return 1.
*/
import java.util.*;
class SuminaMatrix{
	static int findSuminaMatrix(int mat[][]){

		for(int a[]:mat){
			Arrays.sort(a);//1,2,7 //2,4,6 //3,5,6 // 1,2,3 
		}
		int score=0;
		for(int i=0;i<mat[0].length;i++){
			int max=0;
			for(int j=0;j<mat.length;j++){

				max=Math.max(max,mat[j][i]);
			}
			score+=max;//3+5+7=15
		}
		return score;
	}
	public static void main(String[] args) {
		int mat[][] = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
		System.out.println(findSuminaMatrix(mat));
	}
}
/*
15
*/