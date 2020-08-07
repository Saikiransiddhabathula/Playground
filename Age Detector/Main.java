#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,curr;
  cin>>birth>>curr;
  if(birth>=curr)
  {
    int temp=(100+curr)-birth;
    cout<<temp;
  }
  else if(birth<=curr)
    cout<<curr-birth;
    
}