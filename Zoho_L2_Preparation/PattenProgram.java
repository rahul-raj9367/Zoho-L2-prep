/*
    1
   232
  34543
 4567654
567898765
*/
class PattenProgram{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int k=i;k<n;k++){
				System.out.print(" ");
			}
			int p=i;
			for(int j=1;j<=2*i-1;j++){
				if(j<i){
					System.out.print(p++);
				}else{
					System.out.print(p--);
				}
			}
			System.out.println();
		}
	}
}