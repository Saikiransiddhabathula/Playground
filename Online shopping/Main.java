#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f_cost,f_discount,f_charges,s_cost,s_discount,s_charges,a_cost,a_discount,a_charges;
  int f_final,s_final,a_final;
  cin>>f_cost>>f_discount>>f_charges;
  cin>>s_cost>>s_discount>>s_charges;
  cin>>a_cost>>a_discount>>a_charges;
  f_final=(f_cost - (f_cost*f_discount*0.01)) + f_charges;
  s_final=(s_cost - (s_cost*s_discount*0.01)) + s_charges;
  a_final=(a_cost - (a_cost*a_discount*0.01)) + a_charges;
  cout<<"In Flipkart Rs."<<f_final<<"\n";
  cout<<"In Snapdeal Rs."<<s_final<<"\n";
  cout<<"In Amazon Rs."<<a_final<<"\n";
  
  if((f_final<=s_final) && (f_final<=a_final))
     cout<<"He will prefer Flipkart";
  else if((s_final<=f_final) && (s_final<=a_final))
     cout<<"He will prefer Snapdeal";
  else
      cout<<"He will prefer Amazon";
}