/*
 * Given an array with repeated numbers, Find the top three repeated numbers.
input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
output: 3, 16, 15
 */
import java.util.*;
import java.util.Map.Entry;

public class TopThreeRepeated {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,8,12,13,56,78,8,4,4,78,78,78,78};
		HashMap<Integer,Integer> h = new HashMap();
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i], h.get(a[i])+1);
			}
			else
				h.put(a[i],1);
		}
		Set me = h.entrySet();
		List <Entry<Integer,Integer>> l = new LinkedList(me);
		Collections.sort(l, new Comparator<Entry<Integer,Integer>>()
				{
			public int compare(Entry<Integer,Integer> e1,Entry<Integer,Integer> e2)
			{
				return e1.getValue().compareTo(e2.getValue());
			}
				});
		Collections.reverse(l);
		HashMap<Integer,Integer> h2 = new LinkedHashMap();
		for(Entry<Integer,Integer> e:l)
			if(e.getValue()>=2)
			{
				h2.put(e.getKey(), e.getValue());	
			}
			
		Set f = h2.keySet();
		Iterator i = f.iterator();
		while(i.hasNext())
			System.out.println(i.next());
			

	}

}
