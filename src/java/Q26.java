package zoho;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();int c=0,flag=0,d=0;
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		for(int i=0;i<a.length;i++)
		{
			c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					c++;
			}
			if(d!=a[i]&&c>1)
			flag=0;
			if(c>1)
			{
		    d=a[i];
			flag++;
			if(flag==1)
			System.out.println(a[i]+"-"+c);
			

			}
			else
				System.out.println(a[i]+"-"+c);
		}

	}

}
