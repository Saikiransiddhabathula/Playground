#include<iostream>
using namespace std;
int main()
{
  int encry,decod,sum=0,num;
  cin>>encry>>decod;
  num=encry+decod;
  for(int i=1;i<num;i++){
    if(num%i==0){
      sum=sum+i;
    }
  }
  if(sum==num){
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}
  