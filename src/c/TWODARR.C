#include<stdio.h>
#include<conio.h>
void main()
{
int a[10][10],b[10];
int n,r,c,i,j,k,l,r1,n1,t;
clrscr();
printf("\n Enter the number of rows and columns:");
scanf("%d%d",&r,&c);
printf("\n Enter the elements:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
scanf("%d",&a[i][j]);
}
}
printf("\n Enter the row to be sorted:");
scanf("%d",&r1);
for(i=0;i<c;i++)
{
b[i]=a[r1][i];
}
n1=i;
for(i=0;i<n1;i++)
printf("\n%d",b[i]);
for(i=0;i<n1;i++)
{
for(j=i+1;j<n1;j++)
{
if(b[i]>b[j])
{
t=b[i];
b[i]=b[j];
b[j]=t;
}
}
}
printf("sorted elements:");
for(i=0;i<n1;i++)
printf("\n%d",b[i]);
getch();
}