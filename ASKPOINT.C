#include<stdio.h>
#include<conio.h>
void main()
{
static int  n[3][3]={2,4,3 ,
		   6,8,5,
		   3,5,1};
int i,j;
clrscr();
for (i=2;i>=0;i--)
{
for(j=2;j>=0;j--)   {
printf("%d, %d\n",n[i][j],*(*(n+i)+j));
}
}
getch();
}
/* out put:1,1
	   5,5
	   3,3
	   5,5
	   8,8
	   6,6
	   3,3
	   4,4
	   2,2
	   */
