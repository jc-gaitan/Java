#include <iostream>

using namespace std;

int main()
{
    int a, x,y;
    int q,x1,y1;
    cin>>x1>>y1;
    while (x1!=0 && y1!=0)
    {
        x=1;
        y=1;
        q=1;
        if(x1>y1)
        {
            a=x1;
        }
        else
        {
            a=y1;
        }
        a=a+2;
        for (int i = 1; i <= a; i++)
        {

            if (i%2==0)
            {
                x=1;
                y=i;
            }
            else
            {
                x=i;
                y=1;
            }
            for (int j = 1; j <= i; j++)
            {

                if(x1==x && y1==y)
                {
                    i=1000000000;
                    break;
                }
                if (i%2==0)
                {
                    x++;
                    y--;
                }
                else
                {
                    x--;
                    y++;
                }
                q++;


            }

        }
        cout<<q<<endl;

        cin>>x1>>y1;
    }

    return 0;
}
