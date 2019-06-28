import java.util.Scanner;

//Take a 2 or 3 digit input number, reverse it and add it to the original number until the obtained number is a palindrome or 5 iterations are completed.

//Input : n = 32
//Output : 55
//23 + 32 = 55 which is a palindrome.

//Input : 39
//Output : 363
public class Set21Two {

	public static void main(String[] args) {
		// TODO 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s=0,rev=0,num=n,y=0;
		for(int i=0;i<5;i++)
		{
			rev=reverse(n);
			y=n+rev;
			if(y==reverse(y))
			{
				System.out.println(y);
				break;
			}
			n=y;
			
		}
	}
	public static int reverse(int j)
	{
		int s=0,r=0;
		while(j!=0)
		{
			r=j%10;
			s=(s*10)+r;
			j=j/10;
		}
		return s;
		
	}

}
