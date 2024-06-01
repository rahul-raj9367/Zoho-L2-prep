/*
n=4
4 4 4 4 4 4 4  
4 3 3 3 3 3 4   
4 3 2 2 2 3 4   
4 3 2 1 2 3 4   
4 3 2 2 2 3 4   
4 3 3 3 3 3 4   
4 4 4 4 4 4 4  
*/
class PatternProgram3{
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n*2-1;i++){
			for(int j=0;j<n*2-1;j++){
				 int top = i;
	             int bottom = j;
	             int right = (2*n - 2) - j;
	             int left = (2*n - 2) - i;
				int min=Math.min(Math.min(left,right),Math.min(top,bottom));
				System.out.print(n-min+" ");
			}
			System.out.println();
		}
	}
}
