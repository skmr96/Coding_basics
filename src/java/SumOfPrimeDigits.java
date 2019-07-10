import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfPrimeDigits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean isPrime[] = new boolean[10];
		sieveOfEratosthenes(isPrime);
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			while(n > 0) 
			{
				if(isPrime[n%10]) {
					sum += n%10;
				}
				n = n/10;
			}
			System.out.println(sum);
			
		}

	}

	private static void sieveOfEratosthenes(boolean[] isPrime) {
		// TODO Auto-generated method stub
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for(int p = 2; p*p < isPrime.length;p++)
		{
			if(isPrime[p])
			{
				for(int i = p*p; i < isPrime.length;i+=p ) {
					isPrime[i] = false;
				}
			}
		}
	}

}
