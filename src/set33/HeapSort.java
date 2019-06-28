
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={12,11,13,5,6,7};
		sort(a);
	}
	public static void sort(int a[])
	{
		int n =a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,n,i);
			
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp = a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
		
	}
	public static void heapify(int a[],int n,int i)
	{
		int largest=i;
		int l=2*i +1;
		int r=2*i +2;
		if(l<n && a[l]>a[largest])
			largest =l;
		if(r<n && a[r]>a[largest])
			largest=r;
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,n,largest);
		}
	}

}
