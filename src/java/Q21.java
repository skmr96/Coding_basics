package zoho;
import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);int flag;String msg="";
		int m = in.nextInt();int n = in.nextInt();int ch[] = new int[10];
		int ch1[] = new int[m];int ch2[] = new int[n];int k=0;
		for(int i=0;i<m;i++)
			ch1[i] = in.nextInt();
		for(int i=0;i<n;i++)
			ch2[i] = in.nextInt();
		for(int i=0;i<ch2.length;i++)
		{
			flag=0;
			for(int j=0;j<ch1.length;j++)
			{
				if(ch2[i]==ch1[j])
					flag=1;
			}
			if(flag==0)
				ch[k++] = ch2[i];
		}
		

		Arrays.sort(ch1);Arrays.sort(ch);
		for(int i=0;i<ch1.length;i++)
		System.out.print(ch1[i]);
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=0)
		System.out.print(ch[i]);}

	}

}
