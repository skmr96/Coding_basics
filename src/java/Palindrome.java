import java.util.Scanner;

public class Palindrome {

	static Boolean isPalindrome(String s) {
		char str[] = s.toCharArray();
		//System.out.println(s);
		//Boolean flag = true;
		for(int i = 0, j = s.length() - 1; i < j; i++,j--) {
			if(str[i] != str[j]) {
				//flag =false;
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		//System.out.println(line);
		String[] words = line.split(" ");
		/*for(String s:words) {
			System.out.println(s);
		}*/
		String result = "";
		for(int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			if(!isPalindrome(words[i])) {
				result += words[i] +" ";
			}
		}
		System.out.println(result);
		sc.close();

	}

}
