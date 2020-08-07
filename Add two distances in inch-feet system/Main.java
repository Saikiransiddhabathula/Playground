#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float inch1,inch2,final1;
  int feet1,feet2;
  cin>>feet1>>inch1;
  cin>>feet2>>inch2;
  int sum1=feet1+feet2;
  float sum2 = inch1+inch2;
  if(sum2>=12){
    sum1++;
    sum2=sum2-12;
    cout<<sum1<<"'-";
    cout<<sum2<<'"';
  }
  else{
    cout<<sum1<<"'-";
    cout<<sum2<<'"';
  }
}