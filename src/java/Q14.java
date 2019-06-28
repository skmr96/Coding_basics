package zoho;

import java.util.Scanner;

//ABSOLUTE DIFFERENCE OF MATRIX
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i,j,lsum=0,rsum=0,tsum;
		int m=in.nextInt();
		int n=in.nextInt();
		int a[][] = new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				a[i][j]=in.nextInt();
			
		}
		for(j=0;j<n;j++)
			lsum= lsum+a[j][j];
		for(i=0,j=n-1;(i<m&&j>=0);i++,j--)
			rsum=rsum+a[i][j];
		tsum=lsum-rsum;
		System.out.println(Math.abs(tsum));
	}

}
