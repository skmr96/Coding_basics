
public class MinimumSumOfBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=31,num=0,r=0,m=0;
		while(n>=11)
		{
			num=n;
			
		
				r=num%10;
				if(r!=0)
					m=1;
				else
					m=0;
				n=num/10;
				if(n!=0)
					m=(m*10)+1;
				else
					m=0;
				n=num-m;
				System.out.println(m);
		
		
		}
		System.out.println(n);

	}

}
