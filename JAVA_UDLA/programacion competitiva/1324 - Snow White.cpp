#include <bits/stdc++.h>
using namespace std;

int main()
{
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    vector<int> enanos;
    //int enanos[9];
    int total = 0;
    int kk;

    for(int i = 0; i < 9; i++){
        scanf("%d", &kk);
        enanos.push_back(kk);
        total += enanos.at(i);
    }

    total -= 100;

    //printf("%d \n", total);

    int aux = 0;

    for(int i = 0; i < 9; i++){
        for(int j = 1; j < 9; j++){
            if(enanos.at(i) + enanos.at(j)== total){
                //cout << "encontrados" << enanos[i] << " " << enanos[j] << endl;
                enanos.at(i) = -1;
                enanos.at(j) = -1;
                aux = 1;
            }
        }
        if(aux){
            break;
        }
    }

    for(int i = 0; i < 9; i++){
        if(enanos[i] != -1){
            printf("%d \n", enanos[i]);
        }
    }

    //printf("%d", a);
    return 0;

}




