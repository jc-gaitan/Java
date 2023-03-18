#include <bits/stdc++.h>
using namespace std;

int main()
{
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int a, b, c;

    while(cin >> a){
        if(!a) break;
        cin >> b;
        cin >> c;
        if((a*a)+(b*b) == c*c){
            cout << "right" << endl;
        }else if((a*a)+(c*c)== b*b){
            cout << "right" << endl;
        }else if((b*b)+(c*c)== a*a){
            cout << "right" << endl;
        }else{
            cout << "wrong" << endl;
        }
    }

    return 0;
}
