import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//$Id$

public class MatchMaker
{
	private Person men;
	private Person women;
	private Person oldMen;
	private List<Person> mens;
	private List<Person> womens;
	private Map<Person,List<Person>> mensPreference;
	private Map<Person,List<Person>> womensPreference;
	private Map<Person,Person> bestMatch;
	private Map<String,String> couples;
	private int noOfMens; 
	private int noOfWomens;
	private boolean checkPreference;
	
	public MatchMaker(List<Person>mensObj,List<Person>womensObj)
	{
		mens = new ArrayList<Person>();
		womens = new ArrayList<Person>();
		mensPreference =  new HashMap<Person,List<Person>>(); 
		womensPreference =  new HashMap<Person,List<Person>>();
		bestMatch = new HashMap<Person,Person>();
		couples = new HashMap<String,String>();
		
		noOfMens =  mensObj.size();
		noOfWomens = womensObj.size();
		
		for(int men=0;men<mensObj.size();men++){
			this.mens.add(mensObj.get(men));
		}

		for(int women=0;women<womensObj.size();women++)
			this.womens.add(womensObj.get(women));
		
		setPreference();

	}
	
	private void setPreference()
	{
		for(int men=0;men<mens.size();men++){
			mensPreference.put(mens.get(men),mens.get(men).getPreference());
		}
		for(int women=0;women<womens.size();women++){
			womensPreference.put(womens.get(women),womens.get(women).getPreference());
		}
	}
	
	public Map<String,String> getBestMatch()
	{
		for(int n=0;n<=noOfMens;n++)
		{
			for(int m=0;m<mens.size();m++)
			{
				men = mens.get(m);
				if(!men.isSet())
				{
					break;
				}
			}
			for(int m=0;m<noOfMens && !men.isSet();m++)
			{
				women = mensPreference.get(men).get(m);
				if(!women.isSet()){
					bestMatch.put(women, men);
					couples.put(men.getName(),women.getName());
					women.set();
					men.set();
				}
				else{
					oldMen = bestMatch.get(women);
					checkPreference = prefer(womensPreference,women,oldMen,men);
					if(checkPreference)
					{
						bestMatch.put(women,men);
						couples.put(men.getName(), women.getName());
						men.set();
						oldMen.unSet();
					}
				}
			}
		}
		return couples;
	}
	private boolean prefer(Map<Person,List<Person>>womens_pref,Person women, Person oldMen, Person newMen)
	{
		for(int w=0;w<noOfWomens;w++)
		{
			if(womens_pref.get(women).get(w)== newMen)
				return true;
			if(womens_pref.get(women).get(w)== oldMen)
				return false;
		}
		return false;
	}
}
