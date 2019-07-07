import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseVowels {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
			String str = br.readLine();
			char[] str1 = str.toCharArray();
			int i = 0, j = str.length()-1;
			while(i<j) {
				if(isVowel(str1[i])&&isVowel(str1[j])){
					
					char temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
					i++;j--;
				}
				if(!isVowel(str1[i])) {
					i++;
				}
				if(!isVowel(str1[j])) {
					j--;
				}
			}
			String res = String.copyValueOf(str1);
			System.out.println(res);
		}
	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'A' ||
			ch == 'e' || ch == 'E' ||
			ch == 'i' || ch == 'I' ||
			ch == 'o' || ch == 'O' ||
			ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

}
