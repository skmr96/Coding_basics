#include <stdio.h>
#include <limits.h>
#include <stdlib.h>
int h[1000000],hs;

int main()
{
  int i,e;
    //scanf("%d",&n);
    ini();
    for(i=0;i<10;i++)
    {
      scanf("%d",&e);
      insert(e);
    }
    call();
   // for (i=0;i<7;i++)
   // print("%d",h[i]);
    return 0;
}

void ini(){
h[0]= 0;
 hs=0;
}

void insert(int e)
{
  hs++;
  h[hs]=e;
  int now = hs;
  while(h[now/2]>e)
  {
    h[now]=h[now/2];
    now = now/2;
  }
  h[now]=e;
}
void call()
{
 int m = h[1];
 printf("%d\n",m );
}
