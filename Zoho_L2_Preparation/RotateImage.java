/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/
class RotateImage{
	static void findRotateImage(int matrix[][]){
		int n=matrix.length;
		//transpose the array
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}

		for(int i=0;i<n;i++){
			int left=0;
			int right=matrix.length-1;
			while(left<right){
				temp=matrix[i][left];
				matrix[i][left]=matrix[i][right];
				matrix[i][right]=temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

		findRotateImage(matrix);

		for(int w[]:matrix){
			for(int val:w){
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
/*
7 4 1
8 5 2
9 6 3
*/