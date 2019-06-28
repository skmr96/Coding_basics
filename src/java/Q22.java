package zoho;

import java.util.*;
import java.text.*;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=null  ;
		String d2=null;
		//System.out.println(d);
		//Calendar cc = Calendar.getInstance();
		//cc.setTime(d);
		//System.out.println(cc.getTimeInMillis());
		SimpleDateFormat sd = new SimpleDateFormat("dd mmm yyyy");
		String msg = "14 JUL 2016";
		try{
			d1=sd.parse(msg);
			d2=sd.format(d1);
			System.out.println(d2);
		}
		catch(ParseException e){
		System.out.println(e);}
		

	}

}
