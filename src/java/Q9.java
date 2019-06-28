package zoho;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();int flag=0,set=0;int num;
		String msg="";String msg1="";String msg2="";
		ArrayList <String> first = new ArrayList<String>();
		ArrayList <String> second = new ArrayList<String>();
		ArrayList <String> thrid = new ArrayList<String>();
		first.add("zero ");first.add("One Hundred and");
		first.add("Two Hundred and");first.add("Three Hundred and");
		first.add("Four Hundred and");first.add("Five Hundred and");
		first.add("Six Hundred and");first.add("Seven Hundred and");
		first.add("Eight Hundred and");first.add("Nine Hundred and");
		second.add("zero");second.add("zero");
		second.add("twenty ");second.add("thirty");second.add("fourty");
		second.add("fifty");second.add("sixty");second.add("seventy");second.add("eighty ");
		second.add("ninety");thrid.add(" ");
		thrid.add("one");thrid.add("two");thrid.add("three");thrid.add("four");
		thrid.add("five");thrid.add("six");thrid.add("seven");thrid.add("eight");
		thrid.add("nine");
		for(int i=0;n>0;i++)
		{
			num = n%10;
			if(i==0)
			msg=thrid.get(num);
			if(i ==1){
				msg=second.get(num);
			}
			if(i==2){
				msg=first.get(num);
			}
			msg2=msg+msg2;
			n=n/10;
			
		}
		System.out.println(msg2);
	
	}
	

}
