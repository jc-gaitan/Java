#include <bits/stdc++.h>
//#include <cstring>

using namespace std;

int main()
{
    char pala[50];
        int a, b;
        scanf("%s", &pala);

        if(!strcmp(pala, "rectangle"))
        {
            scanf("%d %d", &a, &b);
            printf("%d \n", a*b);
        }
        else
        {
            scanf("%d", &a);
            printf("%d \n", a*a);
        }

    return 0;
}



/*
Devuelve el valor devuelve 0 si son iguales.
Devuelve menor que cero si cadena1 es menor que cadena2.
Devuelve mayor que cero si cadena1 es mayor que cadena2.
*/
