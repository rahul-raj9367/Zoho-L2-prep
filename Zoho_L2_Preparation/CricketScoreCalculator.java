/*
Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
W – Wide N – No Ball . – Dot Ball
Consider the game starts from player 1
I/P:

1 . 2 . 4 3 6 W 1 . N . 2 1
O/P:

P1 – 8
P2 – 12
Extras – 2
*/
class CricketScoreCalculator {
	static void findCricketScoreCalculator(String s){
		int player1=0;
		int player2=0;
		int extra=0;
		boolean onStrike=true;
		for(int i=0;i<s.length();i++){
			char ball=s.charAt(i);

			switch(ball){
				case 'W':
					extra+=1;
					break;
				case 'N':
					extra+=1;
					break;
				case '.':
					break;
				default:
					//check if its digit or not
					if(Character.isDigit(ball)){
						int run=Character.getNumericValue(ball);

						if(onStrike){
							player1+=run;
						}else{
							player2+=run;
						}

						if(run%2!=0){
							onStrike=!onStrike;
						}
					}
					break;
			}
		}

		System.out.println("P1 : " + player1);
        System.out.println("P2 :" + player2);
        System.out.println("Extras : " + extra);
	}
	public static void main(String[] args) {
		String timeline = "1.2.436W1.N.21";
		findCricketScoreCalculator(timeline);
	}
}