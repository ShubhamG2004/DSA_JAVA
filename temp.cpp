#include<iostream>
using namespace std;

template<class T>
T my_min(T a,T b)
{
    if (a<b)
    return a;
    else
    return b; 
}
int main ()
{
    cout<<"min value between integers"<<my_min(34,5);
}