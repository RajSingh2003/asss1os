#include<stdio.h>
void main()
{
 int pid,retnice;
 printf("press DEL to stop process \n");
 pid=fork();
 for(;;)
 {
  if(pid==0)
  {
   retnice = nice(-5);
   printf("child gets higher CPU priority %d\n",retnice);
   exit(1);
  }	
  
  else
  {
   retnice = nice(4);
   printf("parrent gets lower CPU priority %d\n",retnice);
   //sleep(1);
   exit(1);
  }
 }
}

