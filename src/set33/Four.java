import java.util.*;
import java.util.concurrent.TimeUnit;
public class Four 
{
	public static void main(String args[])
	{
		//@SuppressWarnings("deprecation")
		Date d1 = new Date(1996, 7, 14);
	//	@SuppressWarnings("deprecation")
		Date d2 = new Date(2000, 3, 10);
	//	long diff = d2.getTime()-d1.getTime();
		//System.out.println(d1.getTime());
		//System.out.println(TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS));
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
	//	c1.set(2014,2,10);
//		c2.set(2015,3,10);
	//	
//		long d1 = c1.getTimeInMillis();
//		long d2 = c2.getTimeInMillis();
		
//		long d = d2-d1;
		
	//	long diff = d/(24*60*60*1000);
		
	//	System.out.println(diff);
		 //long diff  = (d1.getTime() - d2.getTime())/86400000;
		//System.out.println(Math.abs(diff));
		long f = 8913700000l;
		long r = d1.getTime()+ f;
		System.out.println(new Date(r));
		
	}
}