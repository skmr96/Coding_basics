package zoho;
// 12 HRS FORMAT TO 24 HRS FORMAT
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String time = in.next();in.close();
		String msg="";
		int p,i;
		char ch[]= time.trim().toCharArray();
		p=ch.length;
		if(ch[p-2]=='a')
			System.out.println(time.substring(0,8)+"hrs");
		else
		{
			for(i=0;ch[i]!=':';i++)
				msg= msg+ch[i];
			int t = Integer.parseInt(msg);
			if(t<12)
				t=t+12;
			System.out.println(t+time.substring(2,8)+"hrs");
		}

	}

}
