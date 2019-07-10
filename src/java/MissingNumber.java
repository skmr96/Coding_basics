import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) 
		{
			int n = Integer.parseInt(br.readLine());
			//int a[] = new int[n];
			int realsum = (n * (n+1))/2;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Integer.parseInt(br.readLine());
			}
			System.out.println(realsum-sum);
		}
	}

}
