import java.util.List;

//$Id$

public interface Person {
	
	void setPreference(Person ...preference);
	List<Person> getPreference();
	boolean isSet();
	void set();
	void unSet();
	String getName();

}
