/*import java.util.*;
//$Id$
public class MatchmakerOld {
	 	
	private int men;
	private int size;
	private String men_preference[][];
	private String women_preference[][];
	private	String mens[];
	private	int set_women[];
	private	int set_men[];
	private	boolean check_preference;
	private	HashMap<String,String> best_match = new HashMap<String,String>();
	
	public Matchmaker(int size)
	{
		this.size=size;
		men_preference = new String[size][size];
		women_preference = new String[size][size];
		mens = new String[size];
		set_women = new int[size];
		set_men = new int[size];
	}
	
	public void setMenPreference(String men_prefer[][])
	{
		for(int p=0;p<size;p++)
		{
			for(int row=0;row<size;row++)
			{
				men_preference[p][row] = men_prefer[p][row];
			}
		}
	}
	
	public void setWomenPreference(String women_prefer[][])
	{
		for(int p=0;p<size;p++)
		{
			for(int row=0;row<size;row++)
			{
				women_preference[p][row] = women_prefer[p][row];
			}
		}
	} 
	public void setMens(String mens_array[])
	{
		for(int m=0;m<size;m++)
		{
			mens[m]=mens_array[m];
		}
	}
		
	public void findMatch()
		{
			for(int n=0;n<=size;n++)
			{
				for(men=0;men<size;men++)
				{
					if(set_men[men]==0)
						break;
				}
				for(int row=0;row<size && set_men[men]==0;row++)
				{
					String women = men_preference[men][row];
					int w = Integer.parseInt(women.substring(1));
					w--;
					if (set_women[w]==0)
					{
						best_match.put(women,mens[men]);
						set_women[w]=1;
						set_men[men]=1;
					}
					else
					{
						String old_men = best_match.get(women);
						int om=Integer.parseInt(old_men.substring(1));
						check_preference=prefer(women_preference,w,mens[men],old_men);
						if(check_preference)
						{
							best_match.put(women,mens[men]);
							set_men[men]=1;
							om--;
							set_men[om]=0;
						}
					}		
				}
			}
					
			System.out.println(best_match);	
	}
		
 private boolean prefer(String W_prefer[][],int w, String new_men,String old_men)
	{
		for(int i=0;i<size;i++)
		{
			if(W_prefer[w][i] == new_men)
				return true;
			if(W_prefer[w][i] == old_men)
				return false;
		}
		return false;
	}
}*/
