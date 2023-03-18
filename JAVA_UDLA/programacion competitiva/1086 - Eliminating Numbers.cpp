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

    int a;
    int con;
    int dos = 0, tres = 0, cinco = 0, siete = 0;
    int canPri = 0;

    while(cin >> a){
        con = 0;
        /*if(primo[a] == 0){
            cout << "es primo\n";
        }*/
        for(int i = 2; i <= a; i++)
        {
            if(!(i%2)){
                //cout << i << " -2-" << endl;
                dos = 1;
                con++;
            }else if(!(i%3)){
                //cout << i << " -3-" << endl;
                tres = 1;
                con++;
            }else if(!(i%5)){
                //cout << i << " -5-" << endl;
                cinco = 1;
                con++;
            }else if(!(i%7)){
                //cout << i << " -7-" << endl;
                siete = 1;
                con++;
            }else if(primo[i] == 0){
                canPri++;
            }
        }

        //a = a-1;
        //a = a-con;//cuantos primos hay
        //a = a+dos+tres+cinco+siete;
        a = canPri+dos+tres+cinco+siete;
        cout << a << endl;
        //cout << "cantidad primos: " << canPri <<endl;
        canPri = 0;
    }
    return 0;
}


