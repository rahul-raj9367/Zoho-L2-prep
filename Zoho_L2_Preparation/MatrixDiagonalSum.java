/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
*/
class MatrixDiagonalSum{
	static int findMatrixDiagonalSum(int mat[][]){
		int sum=0;
		int j=mat.length;
		for(int i=0;i<mat.length;i++){
			sum+=mat[i][i];
			sum+=mat[i][j-i-1];
		}

		sum-=(j%2!=0)?mat[j/2][j/2]:0;

		return sum;
	}
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(findMatrixDiagonalSum(mat));
	}
}
/*
OUTPUT
25
*/