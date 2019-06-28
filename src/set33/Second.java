/*
 * 2. Find the result subtraction, multiplication, division of two integers using + operator.
Input: 6 and 4
output:
addition 6+4 = 10,    subtraction  6+(-4) = 2,   multiplication = 24,   division = 1

Input : -8 and -4
Output:
addition -8+(-4) = -12,    subtraction  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2

 */
import java.util.*;
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String m = in.nextLine();
		String n[] = m.split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[2]);
		int add=a+b;
		int sub = a+(-b);
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
		int mul = multiply(a,b); // MULTIPLICATION USING RECURSIVE
		int div=0,p=a,q=b;
		while(p>=q)
		{
			p=p-q;
			div++;
		}
		System.out.println("addition"+" "+a+"+"+b+" "+"="+" "+add+",");
		System.out.println("subraction"+" "+a+"+"+"(-"+b+")"+" "+"="+" "+sub+",");
		System.out.println("multiplication"+" "+"="+mul);
		System.out.println("division"+" "+"="+div);
	}
	public static int multiply(int a,int b)
	{
		if(b==0)
			return 0;
		if(b>0)
			return a+multiply(a,b-1);
		if(b<0)
			return -multiply(a,-b);
		return -1;
	}
}
//MY CODE		

/*		int mul=multiply(a,b);
		int div=0;
		for(int i=1;;i++)
		{
			if(multiply(i,b)>a)
			{
				div=i-1;
				break;
			}
			if(multiply(i,b)==a)
			{
				div=i;
				break;
			}
		}

	}
	
public static int multiply(int a,int b)
{
	int mul=0;
	for(int i=0;i<b;i++)
		mul=mul+a;
	return mul;
}*/
