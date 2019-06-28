import java.util.*;
public class CommonElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[][]=new int[4][5];
		int a[][]={
				{1,2,3,4,5},
				{6,4,1,3,54},
				{12,2,1,3,4},
				{1,7,8,3,5},
		};
	/*int a[][]= {
			{1,2,3},
			{4,1,2},
			{1,5,2},
			
	};*/
		Hashtable<Integer,Integer> h = new Hashtable();
		int o=0;
		while(o<a[0].length)
		{
			h.put(a[0][o],1);
			o++;
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(h.containsKey(a[i][j]))
				{
					if(h.get(a[i][j])==i)
					{
						h.put(a[i][j],(h.get(a[i][j])+1));
						if(i==a.length-1)
						{
							System.out.print(a[i][j]+" ");
						
						}
					
					}
				}
			}
		}
}

}
