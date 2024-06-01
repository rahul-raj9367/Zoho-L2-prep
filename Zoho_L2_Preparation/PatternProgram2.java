/*
--3--
-323-
32123
-323-
--3--
*/
class PatternProgram2{
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print("*");
			}
			int p=n;
			for(int j=1;j<=i*2-1;j++){
				if(j<i){
					System.out.print(p--);
				}else{
					System.out.print(p++);
				}
			}
			for(int k=n;k>i;k--){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<n;i++){
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			int p=n;
			for(int j=n;j>=i*2-1;j--){
				if(j<i){
					System.out.print(p++);
				}else{
					if(j==2){
						System.out.print(p++);
					}else{
						System.out.print(p--);
					}
				}
			}
			for(int k=i;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}