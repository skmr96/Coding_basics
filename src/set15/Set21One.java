// Represent a number using two prime numbers

import java.util.Scanner;

public class Set21One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
			if(isPrime(i))
			{
				if(isPrime(n-i))
				{
					System.out.println(i+","+(n-i));
				    break;
				}
			}
	}
	public static boolean isPrime(int n)
	{
	
	    for(int j=2;j<n;j++)
	    {
	    	if ((n%j)==0){
	    		return false;
	    	}     
	    }
	    return true;
	}
}
