/*
A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

 

Example 1:
Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

Example 2:
Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
*/
import java.util.*;
class SorttheMatrixDiagonally{
	static int[][] findSorttheMatrixDiagonally(int mat[][]){
		int row=mat[0].length;
		int col=mat.length;

		//row;
		for(int i=0;i<row;i++){
			sort(mat,i,0,row,col);
		}

		//col
		for(int i=1;i<col;i++){
			sort(mat,0,i,row,col);
		}

		return mat;
	}
	static void sort(int mat[][],int row,int col,int n,int m){
		List<Integer> list=new ArrayList<>();
		int r=row;
		int c=col;
		//
		while(r<m && c<n){
			list.add(mat[r][c]);
			r++;
			c++;
		}

		Collections.sort(list);
		int index=0;
		r=row;
		c=col;
		while(r<m && c<n){
			mat[r][c]=list.get(index++);
			r++;
			c++;
		}

	}
	public static void main(String[] args) {
		int mat[][] = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		int ans[][]=findSorttheMatrixDiagonally(mat);
		for(int a[]:ans){
			for(int v:a){
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}
}