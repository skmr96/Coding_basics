#include <stdio.h>

int main()
{
  long int a,b,c,sum=0,n,i,max,min;
  scanf("%ld",&a);
  scanf("%ld",&b);
  scanf("%ld",&c);
  scanf("%ld",&n);
  long int d[n];
  d[0]=0;
    d[1] = a*c;
for(i=2 ; i<=n ; i++)
{
    d[i] =d[i-1]*a*b*c + d[i-1]*a*b + d[i-1]*a*c;
    d[i] = d[i]%1000000007;
}
for(i=1 ; i<=n ; i++)
{
  sum = sum+d[i];
}
max = d[1];
for(i=2 ; i<=n ; i++)
{
  if(max<d[i])
  {
  max = d[i]; 
  }
}
min = sum-max;
printf("%ld",min);

    return 0;
}