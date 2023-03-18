#include <bits/stdc++.h>
using namespace std;

int main()
{
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int a, b, c;
    char nom[3] = {'p','e','r'};
    char palabra[310];

    cin >> palabra;

    int con = 0;
    int dias = 0;



    for(int i = 0; i < strlen(palabra); i++)//strlen(palabra) toma lo que se a utilizado del arreglo
    {
        //cout << palabra[i] << " = " << nom[con] <<endl;//
        if(!(tolower(palabra[i]) == nom[con])) dias++;

        con++;

        if(con > 2) con = 0;
    }
    cout << dias << endl;
    return 0;
}


