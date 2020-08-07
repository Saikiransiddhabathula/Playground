#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  cin>>str;
  int rail;
  cin>>rail;
  if(str=="front")
  {
    if(rail==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(str=="rear")
  {
    if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
      
}