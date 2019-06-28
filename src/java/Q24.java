package zoho;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();int a=1;
		System.out.println(a);
		a=2;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+2;
				
			}
			System.out.println();
			a=a-3;
		}

	}

}
