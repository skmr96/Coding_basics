import java.util.Scanner;

public class TwoPrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            printTwoPrime(arr[i]);
        }

	}

	private static void printTwoPrime(int n) {
		// TODO Auto-generated method stub
		boolean isPrime[] = new boolean[n+1];
		sieveOfEratosthenes(n, isPrime);
		for(int i = 2; i <n; i++) {
			if(isPrime[i] && isPrime[n-i]) {
				System.out.println(i+" "+(n-i));
				return;
			}
		}
	}

	private static void sieveOfEratosthenes(int n, boolean[] isPrime) {
		// TODO Auto-generated method stub
		for (int i = 0; i < isPrime.length; i++) {
			isPrime[i]= true;
		}
		for(int p = 2; p*p <= n; p++) {
			if(isPrime[p] == true) {
				for(int i = p*p; i <= n; i+=p) {
					isPrime[i] = false;
				}
			}
		}
	}

}
