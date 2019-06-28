#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
int i,j,k,l;
char s[10],r[10],f[10];
clrscr();
printf("\n Enter the string:");
scanf("%s",s);
printf("%s",s);
/*strrev(s);
printf("\n%s",s);*/
j=0;
for(i=0;s[i]!='\0';i++)
{
printf("\n%c",s[i]);
if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
{
r[j]=s[i];
printf("\n%c",r[j]);
j++;
}
else
k=1;
}
r[j]='\0';
printf("\n%s",r);
strrev(r);
printf("\n%s",r);
j=0;
for(i=0;s[i]!='\0';i++)
{
if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
{
s[i]=r[j];
j++;
}
else
s[i]=s[i];
}
printf("\n%s",s);
getch();
}
