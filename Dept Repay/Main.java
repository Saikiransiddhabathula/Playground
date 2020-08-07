#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int principle,rate_of_intrest,time;
 float intrest,amount,discount,final_amount;
 std::cin>>principle>>rate_of_intrest>>time;
 intrest=(principle*rate_of_intrest*time)/100;
 amount=principle+intrest;
 discount=(intrest*2)/100;
 final_amount=amount-discount;
 std::cout<<intrest<<"\n"<<amount<<"\n"<<discount<<"\n"<<final_amount; 
}