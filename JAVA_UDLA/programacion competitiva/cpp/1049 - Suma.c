#include <stdio.h>

int main()
{
int a = 0;
scanf("%d", &a);
if(a < 0){
printf("%d", (((a*-1)*(a-1))/2)+1);//(n*(n+1))/2
}else{
printf("%d", ((a*(a+1))/2));//(n*(n+1))/2
}
return 0;
}
