//Sample: 
//Array : {2, 3, 7, 1, 8, 5, 11} 
   
//Output: 
//{2­>3, 3­>5, 7­>8, 1­>2, 8­>11, 5­>7, 11­>}
import java.util.*;
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Scanner in = new Scanner(System.in);
		int a[]={2, 3, 7, 1, 8, 5, 11, 14};
		int b[] =a.clone();
		Arrays.sort(a);
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==b.length-1)
				{
					System.out.println(b[i]+"->");
					break;
				}
			    if(b[i]==a[j] )
				{
					System.out.println(a[j]+"->"+a[j+1]);
				}
				
			}
		}
	}

}
