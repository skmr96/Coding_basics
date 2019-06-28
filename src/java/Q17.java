package zoho;
// PRINTING NUMBER OF CHARACTERS USING LOOP
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);int r,c,num=0,p;
		int n = in.nextInt();in.close();
		for(int i=1;i<=n;i++)
		{
			p=i;
			c=0;
			while(p>0)
			{
				r = p%10;
				c++;
				p=p/10;
			}
			num = num+c;
			
		}
		System.out.print(num);
		

	}

}
