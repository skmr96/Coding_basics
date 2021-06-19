//$Id$
import java.util.*;



public class NewMatchMaker {

	public static void main(String[] args) {
		
		Person m1 = new Men("FM");
		Person m2 = new Men("SM");
		Person m3 = new Men("TM");
		
		Person w1 = new Women("FW");
		Person w2 = new Women("SW");
		Person w3 = new Women("TW");
		
		m1.setPreference(w1,w3,w2);
		m2.setPreference(w2,w1,w3);
		m3.setPreference(w2,w1,w3);
		
		w1.setPreference(m1,m2,m3);
		w2.setPreference(m3,m2,m1);
		w3.setPreference(m1,m3,m2);
		
		MatchMaker  mm =  new MatchMaker(Arrays.asList(m1,m2,m3),Arrays.asList(w1,w2,w3));
		System.out.println(mm.getBestMatch());

	
		
		
		
		

	}

}
