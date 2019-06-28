package zoho;
//NUMBER OF CHARACTERS
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();String msg="";
		int i;
		for(i=1;i<=n;i++)
			msg= msg+i;
		char ch[] = msg.toCharArray();
		System.out.println(ch.length);
	}

}
