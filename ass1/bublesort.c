#include<stdio.h>
#include<sys/wait.h>
int n,a[10];
void bubble();
void insertion();
int main()
{
  int i,pid;
  printf(" \n Enter the size of arrays :");
  scanf("%d",&n);
  printf("\n Enter the array elements :");
  for(i=0;i<n;i++)
  {
   scanf("%d",&a[i]);
  }
  printf("\nThe array elements :");
  for(i=0;i<n;i++)
  {
   printf("%d\t",a[i]);
  }
  pid=fork();
  if(pid==0)
  {
   printf("\n Child processed ID :%d\n",getpid());
   insertion();
   printf("Sorted array Element :");
   for(i=0;i<n;i++)
    printf("%d",a[i]);
    printf("\n");
  }
  else
  {
   wait(NULL);
   printf("\nParrent Processed Id %d:",getpid());
   bubble();
   printf("\n sorted array elements :");
   for(i=0;i<n;i++)
   printf("%d",a[i]);
  }
}

void bubble()
{
 int i,j,temp;
 for(i=0;i<n-1;i++)
  for(j=0;j<n;j++)
   if(a[j]>a[j+1])
   {
   temp=a[j];
   a[j]=a[j+1];
   a[j+1]=temp;
   }
}
void insertion()
{
 int i,j,temp;
 for(i=1;i<n;i++)
 {
  temp=a[i];
  j=i-1;
  for(j>=0;a[j]>temp;j--)
  {
   a[j+1]=a[j];
  }
  a[j+1]=temp;
 }
}

