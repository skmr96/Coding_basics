package zoho;
// PRINTING K IN THE FORM OF 1's AND 0's
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,m=5,n=3;
		for(i=0;i<m;i++)
		{
			System.out.print("1");
			for(j=1;j<n-i;j++)
				System.out.print("0");
			System.out.println("1");
			if(i==n)
			break;
		}
		for(i=0;i<m-n;i++){
			System.out.print("1");
		for(j=1;j<=i+1;j++)
			System.out.print("0");
		System.out.println("1");}
	}

}
