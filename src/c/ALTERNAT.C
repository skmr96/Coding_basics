#include<stdio.h>
#include<conio.h>
int main()
{
int a[20],b[20];
int i,j,k,l,t,*p,*q,n;
printf("\n Enter the number of elements:");
scanf("%d",&n);
printf("\n Enter the elements:");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
p=a;q=(a+n-1);
//printf("%d",*p);
//printf("%d",*q);
for(i=0;i<n;i+=2)
{
b[i]=*q;
b[i+1]=*p;
++p;
--q;
}
for(i=0;i<n;i++)
printf("\n%d",b[i]);
getch();return 0;
}
