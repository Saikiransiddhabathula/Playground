#include <iostream>
using namespace std;
int swap(int &x,int &y){
  x =x+y ;
  y=x-y;
  x=x-y;
}
int main() 
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
    return 0;
}