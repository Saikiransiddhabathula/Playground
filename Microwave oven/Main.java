#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int no_of_items;
  float h_time,r_time;
  cin>>no_of_items>>h_time;
  if(no_of_items>3)
    cout<<"Number of items is more";
  else
  {
    r_time=((no_of_items * h_time) - ((no_of_items-1)*(h_time/2)));
    cout<<r_time;
  }
}