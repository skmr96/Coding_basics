
public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=n;
		for(int i=0;i<n;i++)
		{
			for(int j=k-1;j>i;j--)
				System.out.print(" ");
			//k=k-1;
			for(int j=0;j<=i;j++)
				System.out.print(" *");
			System.out.println();
		}
	/*	n=0;
		while(n<5)
		{
			for(int i=0;i<=n;i++)
				System.out.print("* ");
			System.out.println();
			n++;
		}
*/	
/*		int y=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++){
				System.out.print(y+" ");
				y++;
		}
		System.out.println();	
		}
*/
	}

}
