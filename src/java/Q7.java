package zoho;
//GRANDPARENTS  
import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,c=0;
		String search="";
	ArrayList<String>child = new ArrayList<String>();	
	ArrayList<String>father = new ArrayList<String>();
	child.add("jo");child.add("jack");child.add("john");child.add("supriya");
	father.add("rooney");father.add("jo");father.add("jo");father.add("kanthasamy ");
	Scanner in = new Scanner(System.in);
	String msg = in.next();
	if(father.contains(msg))
	{
		a=father.indexOf(msg);
		search = child.get(a);
	}
	for(int i=0;i<father.size();i++)
	{
		String se = father.get(i);
		if(search.equals(se))
			c++;
	}
	System.out.println(c);
	
	}

}
