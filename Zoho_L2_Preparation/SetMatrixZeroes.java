/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
class SetMatrixZeroes{
	static int[][] findSetMatrixZeroes(int matrix[][]){
		int n=matrix.length;
		int m=matrix[0].length;

		int row[]=new int[m];
		int col[]=new int[n];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(row[i]==1 || col[j]==1){
					matrix[i][j]=0;
				}
			}
		}

		return matrix;
	}
	public static void main(String[] args) {
		int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
		int ans[][]=findSetMatrixZeroes(matrix);
		for(int a[]:ans){
			for(int val:a){
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT
1 0 1
0 0 0
1 0 1
*/