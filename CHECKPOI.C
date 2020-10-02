#include<stdio.h>
#include<conio.h>
void main()
{

static int a[]={0,1,2,3,4};
static  int *p[]={a,a+1,a+2,a+3,a+4};
 int **ptr=p;
 clrscr();
 printf("%d, %d\n",a,*a); // 170,0
 printf(" %d, %d, %d\n",p,*p,**p); //180,170,0
 printf("%d, %d, %d\n",ptr,*ptr,**ptr);   //180,170,0
ptr++;
printf("%d ,%d, %d\n",ptr-p,*ptr-a,**ptr);    //1,1,1
*ptr++;
printf("%d,%d,%d\n",ptr-p,*ptr-a,**ptr);   //2,2,2
++*ptr;
printf("%d,%d,%d\n",ptr-p,*ptr-a,**ptr); //2,3,3
 getch();
}
