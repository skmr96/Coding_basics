import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap();
		m.put("sathish", 21);
		m.put("sachin",44);
		//Set<String> s = m.keySet();
		Set s=m.entrySet();
		//Iterator<String> i = s.iterator();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			//String f = i.next();
			//System.out.println("Age of "+f+" is "+m.get(f));
			
			Object f = i.next();
			System.out.println("Age of "+f+" is "+m.get(f));
			
			//Map.Entry me = (Map.Entry)i.next();
			//me.setValue("dhoni");
	//		System.out.print(me.getKey()+" is "+me.getValue());
		//	System.out.println();
		}
		HashSet h = new HashSet();
		h.add("1");
		h.add("2");
		h.add("3");
		h.add("4");
		System.out.println(h);
		System.out.println(h.hashCode());
		
		LinkedList l = new LinkedList();
		l.add(4);
		l.add(2);
		l.add(3);
		System.out.println(l.get(0));
	//	Collections.rotate(l,-1);
		System.out.println(Collections.binarySearch(l,4));
		System.out.println(l);
		System.out.println(l.hashCode());
		
		HashMap hm = new HashMap();
		hm.put("sathish", 21);
		hm.put("satheesh", 22);
		System.out.println(hm.values());
		
		int n=113;
		String msg="";
		for(int i1=1;i1<=n;i1++)
			msg=msg+i1;
		char ch[]=msg.toCharArray();
		System.out.println(ch.length);
		
		ArrayList<String> child = new ArrayList();
		ArrayList<String> father = new ArrayList();
		Scanner in = new Scanner(System.in);
		String g[][]= new String[2][2];
		for(int j=0;j<2;j++)
			for(int k=0;k<2;k++)
				g[j][k]=in.nextLine();
		/*String g[][]={
				{"luke","shaw"},
				{"wayne","rooney"},
					};*/
		for(int j=0;j<g.length;j++)
			child.add(g[j][0]);
		for(int j=0;j<g.length;j++)
			father.add(g[j][1]);
		System.out.println("Child "+child);
		System.out.println("Father "+father);
		
		

	}

}
