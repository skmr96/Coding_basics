//$Id$
/*
 * Given two strings, find the first occurence of all characters of second string in the first string and
print the characters between the least and the highest index

I/P: ZOHOCORPORATION PORT
O/P: OHOCORPORAT

Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
So print the characters of the first string in this index range i.e. OHOCORPORAT
 */
public class FirstOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="ZOHOCORPORATION";
		String toFind="PORT";
		int min=Integer.MAX_VALUE,max=0,index=0;
		for(int i=0;i<toFind.length();i++)
		{
			index=input.indexOf(toFind.charAt(i));
			if(index<min && min!=0){
				min=index;
			}
			if(index>max){
				max=index;
			}
		}
		

	}

}
