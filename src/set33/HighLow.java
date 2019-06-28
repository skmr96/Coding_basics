/*
 * 3.Given an array with several elements and high ,low value print 
 * the missing numbers in the given sequence excluding the low and high values
INPUT				OUTPUT
1 5 8 10 15 18 20
LOW- 10 			11 12 13 14 16 17 19
HIGH-20

33 45 43 22 15 34
LOW-14				16 17 18 19 20 21 23 24
HIGH-25	
32 30 3 2 5 64 21	LOW -25 HIGH-30  26 27 28 29
 */
public class HighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1 ,5 ,8, 10 ,15 ,18 ,20};
		int l=10;
		int h=20,flag=0;
		for(int i=l+1;i<h;i++)
		{
			int num =i;
			flag=1;
			for(int j=0;j<a.length;j++)
			{
				if(num==a[j])
				{
					flag=0;
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
	}

}
