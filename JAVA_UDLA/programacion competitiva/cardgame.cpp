#include <bits/stdc++.h>
using namespace std;

int main()
{
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    unsigned long long a = 0;
    int tam;
    float tamano;
    unsigned aux = 0;


    while(cin >> a)
    {
        vector<double> v;
        for(int i = 1; i <= a; i++)
        {
            v.push_back(i);
        }

        while(v.size()>1)
        {
            tamano = (float)v.size()/2;
            tam = v.size()/2;

            //cout << "tamano : " << tamano << endl;

            if(tamano-tam)
            {
                tam++;
                //cout << "decimal : " << tam << endl;
            }
            else
            {
                tam = tamano;
                //cout << "entero: " << tamano << endl;
            }

            //
            int i;
            for (i = tam-1; i < v.size() - 1; i++)
                v[i] = v[i + 1];
            v.pop_back(); // remove last elt
            //

            aux = v[0];
            v[0] = v[v.size()-1];
            v[v.size()-1] = aux;

            int aux2;
            for(int i = 1; i < v.size(); i++)
            {
                aux2 = v[i];
                v[i] = aux;
                aux = aux2;
            }

            /*for(int i = 0; i < v.size(); i++)
                cout << v[i] << " ";*/
        }

        cout << v[0] << endl;
        v.clear();

    }



    return 0;
}


