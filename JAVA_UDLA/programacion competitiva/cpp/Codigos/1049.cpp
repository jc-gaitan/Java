#include <bits/stdc++.h>
using namespace std;

int factorial(int num)
{
    if (num == 1)
    {
        return 1;
    }
    else
    {
        return num * factorial(num-1);
    }
}

int main()
{
    int a = 0;
    scanf("%d", &a);
    printf("%d \n", factorial(a));

    return 0;
}
