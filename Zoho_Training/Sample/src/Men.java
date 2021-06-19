import java.util.ArrayList;
import java.util.List;

//$Id$

public class Men implements Person
{
	private List<Person> preference;
	private boolean set;
	private String name;
	
	public Men(String name)
	{
		preference = new ArrayList<Person>();
		set=false;
		this.name = name;
	}

	public List<Person> getPreference() {
		return preference;
	}

	public void setPreference(Person ...preference) {
		for(Person i : preference)
			this.preference.add(i);	
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isSet(){
		return set;
	}

	public void set() {
		set=true;	
	}
	
	public void unSet() {
		set=false;
	}	
}