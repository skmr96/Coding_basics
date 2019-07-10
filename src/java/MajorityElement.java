import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajorityElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =  Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().trim().split("\\s");
			int a[] = new int[n];
			boolean flag = false;
			for (int i = 0; i < str.length; i++) {
				int k = Integer.parseInt(str[i]);
				a[k]++;
				if(a[k] > n/2) {
					System.out.println(k);
					flag = true;
					break;
				}
			}
			if(!flag )
				System.out.println("-1");
		}
	}

}
