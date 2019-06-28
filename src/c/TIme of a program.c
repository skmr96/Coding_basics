#include <stdio.h>
#include <dos.h>
 #include <time.h>
int main()
{
    int pskills[] = { 10, 20, 30, 40, 50 };
      int i, *ptr ;
      ptr = pskills;
      for ( i = 0 ; i <4 ; i++ )
     {
          fun(ptr++);
          printf ("\n%", *ptr ) ;
       }
  }
 void fun(int *i)
  {
      *i = *i + 1;
  }


