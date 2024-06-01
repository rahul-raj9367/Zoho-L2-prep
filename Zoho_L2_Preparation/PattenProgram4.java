/*
n=3
1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2 2 1
1 1 1 1 1 
*/
class PattenProgram4{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<2*n-1;j++){
				int top=i;
				int bottom=j;
				int right=(2*n-2)-j;
				int left=(2*n-2)-i;
				int min=Math.min(Math.min(left,right),Math.min(top,bottom));
				System.out.print(1+min+" ");
			}
			System.out.println();
		}
	}
}
/*
1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2 2 1
1 1 1 1 1
*/