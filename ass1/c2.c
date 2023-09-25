#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
int main()
{
 pid_t pid=fork();
 if(pid<0)
 {
  perror("fork faoiled");
  return 1;
 }
 else if(pid==0)
 {
 if("/bin/Is","Is",NULL);
 perror("execl failed");
 return 1;
 }
 else
 {
  wait(NULL);
  printf("I am parrent \n");
 }
 return 0;
}
