#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
int n,n1,n2,i,j,k,l=0,x,sum=0;
clrscr();
printf("\n Enter your number:");
scanf("%d",&n);
n1=n;
n2=n;
while(n1!=0)
{
x=n%10;
l=l+1;
n1=n1/10;
}
printf("\n Length of number:%d",l);
while(n2!=0)
{
x=n2%10;
sum=sum+pow(x,l);
n2=n2/10;
}
if(n==sum)
printf("Armstrong number");
else
printf("Not");
getch();
}