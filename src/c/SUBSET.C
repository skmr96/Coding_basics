#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
int n,i,j,l;
int a[]={1,2};
clrscr();
n=pow(2,2);
printf("\n%d",n);
for(i=0;i<n;i++)
{
//printf("{");
for(j=0;j<n;j++)
{
if(i&(1<<j))
printf("%d",a[j]);
}
//printf("}");
printf("\n");
}
getch();
}