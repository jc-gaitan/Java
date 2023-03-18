#include <bits/stdc++.h>
using namespace std;

int m= 5000000, primo[5000010];
 int lim = sqrt(m)+1;

void criba(){
    memset(primo, 0, sizeof(primo));
    primo[0] = primo[1] = 1;

    for(int i = 2; i < m; i++){
        if(primo[i]) continue;
        if(i > lim) continue;

        for(int j = i*i; j < m; j += i)
            primo[j] = i;
    }
}


int main()
{
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    criba();

    int num;
    cin >> num;

    int mcd;
    int con =  0;
    for(int i = 0; i < num; i++){
        mcd = __gcd(i,num);
        if(!(primo[mcd])){
            con++;
        }
        /*if(!(primo[i])){
            cout << "es primo " << i <<endl;
            cout << "maximo comun divisor: " << __gcd(i,num) << endl;
            //__gcd(i,num) solo sirve en c++ 11
        }*/
    }

    cout << con << endl;

    return 0;
}


