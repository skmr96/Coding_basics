
public class Set18Three {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,4,8,10};
		int n=18,c=0;
		for(int i=0;i<a.length;i++)
		{
			int k=a[i];
			for(int j=0;j<a.length;j++)
			{
				if( k+a[j]==n && i!=j)
				{
					System.out.println("true");
					j=a.length;
					i=a.length;
				}
			}
		}
	}

}
