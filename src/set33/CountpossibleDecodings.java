
public class CountpossibleDecodings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,2,1};
		int n = a.length;
		int count[]=new int[5];
		
		count[0]=1;
		count[1]=1;
		for(int i=2;i<=a.length;i++)
		{
			if(a[i-1]>0)
			{
				count[i]=count[i-1];
			}
			if(a[i-2]==1 || a[i-2]==2 && a[i-1]<7)
			{
				count[i]=count[i]+count[i-2];
			}
		}
		System.out.println(count[count.length-1]);
		

	}

}
