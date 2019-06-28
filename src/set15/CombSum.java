// Input = {2,4,9,8,12,1,11}
// N = 13
// Output->  2,11 4,9 12,1

public class CombSum {

	public static void main(String[] args) {
// TODO Auto-generated method stub
			int a[] = {2,4,9,8,12,1,11};
			int i=0,n=13,temp1=0,temp2=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==n && temp1!=a[j] && temp2!=a[i])
				{
					temp1=a[i];
					temp2=a[j];
					System.out.println(a[i]+" "+a[j]);
		
				}
				if(j==a.length-1 && i<a.length-1)
				{
					j=0;
					i++;
				}
			}
	}

}
