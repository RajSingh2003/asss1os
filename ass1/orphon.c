#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main()
{
	pid_t child_pid;
	child_pid=fork();
	if(child_pid<0)
	{
	  perror("fork error");
	  exit(1);
	}
	else if(child_pid ==0)
	{
	  printf("Child process:\n");
	  printf("PID:%d\n",getpid());
	  printf("Parent PID :%d\n",getppid());
	  printf("Child process sleeping for 5 seconds...\n");
	  sleep(5);
	  printf("Child processed completed.\n");
	 }
	  else
	  {
	  printf("Parent process:\n");
	  printf("PID:%d\n",getpid());
	  printf("Parent PID :%d\n",getppid());
	  printf("Parent proces terminating...\n");
	  }
	  return 0;
}

