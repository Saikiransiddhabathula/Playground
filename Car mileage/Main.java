#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol_aval,dis_to_cover;
  cin>>mileage>>petrol_aval>>dis_to_cover;
  if(dis_to_cover<=(mileage*petrol_aval))
     cout<<"Can reach";
  else
     cout<<"Cannot reach";
}