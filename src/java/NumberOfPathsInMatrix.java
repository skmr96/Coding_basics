import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPathsInMatrix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String[] str = br.readLine().trim().split("\\s");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			System.out.println( numberOfPathsDp(m,n));
		}

	}

	private static int numberOfPathsDp(int m, int n) {
		// TODO Auto-generated method stub
		int count[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			count[i][0] = 1;
		}
		for (int j = 0; j < n; j++) {
			count[0][j] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				count[i][j] = count[i-1][j] + count[i][j-1]; //+count[i-1][j-1] //to add diagonal path
			}
		}
		return count[m-1][n-1];
	}

	private static int numberOfPaths(int m, int n) {
		// TODO Auto-generated method stub
		if(m == 1 || n == 1)
			return 1;
		return numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
	}
	

}
