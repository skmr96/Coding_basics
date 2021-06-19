//$Id$
import java.util.*;
class StackObj<T>
{
	@SuppressWarnings("unchecked")
	T ob[] = (T[])new Object[10];
	
	public void add(T data)
	{
		ob[0]=data;
	}
	
	public T get()
	{
		return ob[0];
	}

	public void addTo(T i) {
		// TODO Auto-generated method stub
		ob[1]=i;
		
	}

	public T getFrom() {
		// TODO Auto-generated method stub
		return ob[1];
		
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.setSize(2);
		s.push(3);
//		System.out.println(s.peek());
		
		System.out.println("----------------------");
	
		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(5);
		h.add(6);
		

		StackObj<Integer> so = new StackObj<Integer>();
		so.add(5);
		//System.out.println(so.get());


		StackObj<String> so1 = new StackObj<String>();
		so1.add("hello");
	//	System.out.println(so1.get());
		
		int a[] = {1,1,2,2,3,4,4,5};
		TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
	
		Integer ca = t.get(a[i]);
		if(ca == null)
		{
			t.put(a[i], 1);
			
			
			
		}
		else
		{
			Integer r = t.get(a[i]);
			t.put(a[i], ++r);
		}
		}
		
		//for(int i=0;i<a.length;i++)
//		{
			System.out.println(t);
	//	}

			
			int g = Math.min(1, 1);
			
			List<Integer> b = new ArrayList<Integer>();
			b.add(7);
			b.add(3);
			b.add(1);
			
			System.out.println(Collections.min(b));

		
		
		
		
		

	}

}
