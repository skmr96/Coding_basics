#include <stdio.h>
void fun(int *ptr)
{
    *ptr=100;
}
int main()
{
    int num=50;
    int *pp= #
    fun(& *pp);
    printf("%d,%d",num,*pp);
    return 0;
}
