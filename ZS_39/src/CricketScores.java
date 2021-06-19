//$Id$
/*
 * Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
W – Wide N – No Ball . – Dot Ball
Consider the game starts from player 1
I/P:
1 . 2 . 4 3 6 W 1 . N . 2 1
O/P:

P1 – 8
P2 – 12
Extras – 2
 */
public class CricketScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String overs = "1 . 2 . 4 3 6 W 1 . N . 2 1";
		char runs[]=overs.toCharArray();
		int players[]=new int[3];
		int extras=0,player=1,strike=0;
		for(int i=0;i<runs.length;i++)
		{
			if(Character.isLetter(runs[i]))
			{
				extras++;
			}
			if(Character.isDigit(runs[i]))
			{
				players[player]=players[player]+Character.getNumericValue(runs[i]);
				if((runs[i]%2!=0) && strike==0){
					player=2;
					strike=1;
				}
				else if((runs[i]%2!=0) && strike==1)
				{
					player=1;
					strike=0;
				}
			}
		}
		System.out.println("P1 -"+players[1]);
		System.out.println("P2 -"+players[2]);
		System.out.println("Extras -"+extras);
		

	}

}
