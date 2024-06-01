/*
1)Find out how much profit can be made in FOREX by buying and selling a foreign currency for the given local 
Note: Only one transac local currency prices (For the hour)e unit can be bought at a time.
Input:
1) Hourly prices:(1, 5, 2, 3, 7, 6, 4, 5),
Output:
Total profit:10
buying hour: 1, selling hour: 2
buying hour:3, selling hour: 5
buying hour: 7, selling hour: 8
2)(5, 5, 10, 8, 7, 6, 4, 5,2,6,1,10) 
Buy on day 1 and sell on day 3 Buy on day 7 and sell on day 8 Buy on day 9 and sell on day 10 Buy on day 11 and sell on day 12
Total profit earned is 19
*/
class ForexBuying{
	static int findForexBuying(int arr[]){
		int maxProfit=0;

		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				maxProfit+=arr[i+1]-arr[i];
			}
		}

		return maxProfit;
	}
	public static void main(String[] args) {
		int arr[]={1, 5, 2, 3, 7, 6, 4, 5};
		System.out.println(findForexBuying(arr));
	}
}
/*
10
*/