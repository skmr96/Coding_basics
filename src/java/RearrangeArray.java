import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangeArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String[] str = br.readLine().trim().split(" ");
			for (int i = 0; i < arr.length; i++) {
				arr[i]	= Integer.parseInt(str[i]);
			}
			int min_idx = 0, max_idx = n-1;
			int max_e = arr[n-1]+1;
			System.out.println(max_e);
			for (int i = 0; i < arr.length; i++) {
				if(i%2 == 0) {
					System.out.println("EVEN: arr["+max_idx+"]%"+max_e+":"+arr[max_idx] % max_e);
					arr[i] += (arr[max_idx] % max_e) * max_e;
					max_idx--;
				}
				else {
					System.out.println("ODD: arr["+min_idx+"]%"+max_e+":"+arr[min_idx] % max_e);
					arr[i] += (arr[min_idx] % max_e) * max_e;
					min_idx++;
				}
				printArray(arr);
			}
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i]/max_e;
			}
			printArray(arr);
		}

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
