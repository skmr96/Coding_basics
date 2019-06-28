#include<stdio.h>
#include<conio.h>
void main()
{
int a[20],i,j,k,x,n;
clrscr();
printf("\n Enter the size of array:");
scanf("%d",&n);
printf("\n Enter the elements:");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
i=0;j=1;
while(j!=n)
{
for(k=0;k<n;k++)
{
x=a[i]+a[j]+a[k];
if(x==0)
printf("<%d,%d,%d>",a[i],a[j],a[k]);
}
i++;
j++;
}
getch();
}