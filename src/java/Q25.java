package zoho;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg[] = new String[10];
		for(int i=0;i<=2;i++)
			 msg[i]=in.next();
		for(int i=2;i>=0;i--)
			System.out.print(msg[i]+" ");
		

	}

}
