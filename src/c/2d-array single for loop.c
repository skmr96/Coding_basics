#include <stdio.h>
void main()
{
	 int a[3][3],i,n,*p;scanf("%d",&n);
	 for (p=a;p<a+n;p++)
	 	scanf("%d",&*p);
	 for (p=a;p<a+n;p++)
	 printf("%d",*p);
}
