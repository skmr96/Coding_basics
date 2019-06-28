package zoho;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		//String msg= in.next();
		//int o=0;
		//int c=0,i;
		//char ch[] = msg.toCharArray();
		//ArrayList<String> f = new ArrayList<String>();
		//f.add("hello");
		//f.get(0);
			int a[]= {2,5,1,3,4};
			//Arrays.sort(a);
			//for(int i=4;i>=0;i--)
				//System.out.print(a[i]+" ");
			int r[]=add(a);
			for(int i=0;i<r.length;i++)
			System.out.println(r[i]);
	}
			
			static int[] add (int []b)
			{
				int s[]= new int[b.length];
				for(int i=0;i<b.length;i++)
					s[i]=s[i]+b[i];
				return s;
			}
			

	}


