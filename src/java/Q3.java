package zoho;

import java.util.Scanner;


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg= in.next();
		int i,j,flag;
		char cha[] = msg.toCharArray();
		int ch[]=new int[cha.length];
		int low = in.nextInt();
		int high = in.nextInt();
		int n=cha.length;
		for(i=low+1;i<high;i++)
			{
			flag=0;
				for(j=0;j<n;j++)
				{
					if(i==ch[j])
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				System.out.print(i+" ");
			}
	
		
		

	}

}
