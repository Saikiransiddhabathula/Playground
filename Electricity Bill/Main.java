#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  int charge;
  cin>>units;
  if(units<=200)
  {
    charge=units*0.5;
    cout<<"Rs."<<charge;
  }
  else if(units<=400)
  {
    charge=(units*0.65)+100;
    cout<<"Rs."<<charge;
  }
  else if(units<=600)
  {
    charge=(units*0.80)+200;
    cout<<"Rs."<<charge;
  }
  else if(units>600)
  {
    charge=(units*1.25)+425;
    cout<<"Rs."<<charge;
  }
}