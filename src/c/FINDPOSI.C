#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void insert();
void findposition();
struct node
{
int data;
struct node *next;
}*p,*head,*q;
int main()
{
int ch,n,k,n1;
insert();
findposition();
getch();
return 0;
}
void insert(int x)
{
int ch,n;
p=(struct node *)malloc(sizeof(struct node));
head=p;
printf("Enter the element:");
scanf("%d",&p->data);
p->next=NULL;
do
{
q=(struct node *)malloc(sizeof(struct node));
printf("Enter the element:");
scanf("%d",&q->data);
q->next=NULL;
p->next=q;
p=q;
printf("\n Enter 1 to continue and 0 to exit");
scanf("%d",&ch);
}while(ch!=0);
p->next=NULL;
}
void findposition()
{
int count=0;
p=head;
while(p->next->next->next->next->next!=NULL)
{
p=p->next;
count=count+1;
}
printf("Element is:%d",p->data);
printf("Position is :%d",count);

}
