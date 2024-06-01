/*


*/
class FindCount{
	static void findCount(int arr[]){
		int freq[]=new int[100];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<100;i++){
			if(freq[i]>1){
				System.out.print(i+"->"+freq[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]={1,1,2,2,2,4,5,5,5,10,22};
		findCount(arr);
	}
}