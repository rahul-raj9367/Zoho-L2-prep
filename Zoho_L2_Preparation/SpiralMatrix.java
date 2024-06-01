/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]


Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

*/
import java.util.*;
class SpiralMatrix{
	static List<Integer> findSpiralMatrix(int mat[][]){
		List<Integer> list=new ArrayList<>();
		int top=0;
		int left=0;
		int right=mat[0].length-1;
		int bottom=mat.length-1;

		while(top<=bottom  && left<=right){
			for(int i=left;i<=right ;i++){
				list.add(mat[top][i]);
			}
			top++;

			for(int i=top;i<=right;i++){
				list.add(mat[i][right]);
			}
			right--;

			if(top<=bottom){
				for(int i=right;i>=left;i--){
					list.add(mat[bottom][i]);
				}
				bottom--;
			}

			if(left<=right){
				for(int i=bottom ;i>=top;i--){
					list.add(mat[i][left]);
				}
				left++;
			}
		}

		return list;
	}
	public static void main(String[] args) {
		int  matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(findSpiralMatrix(matrix));
	}
}
/*
OUTPUT
[1, 2, 3, 6, 9, 8, 7, 4, 5]
*/