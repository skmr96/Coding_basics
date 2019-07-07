import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWord {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			String line = sc.next();
			String words[] = line.split("\\.");
			for (int i = 0; i < words.length; i++) {
				for (int j = words[i].length()-1; j >= 0; j--) {
					System.out.print(words[i].charAt(j));
				}
				if(i < words.length - 1)
					System.out.print(".");
			}
			System.out.println();
			t--;
		}
	}
}
