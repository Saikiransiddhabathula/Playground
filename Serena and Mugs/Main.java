#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,result=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++){
    if(a[i]>s){
      cout<<"NO";
      break;
    }
    else{
      result=result+a[i];
    }
  }
  if(result<=s){
    cout<<"YES";
  }
  else{
    cout<<"NO";
  }
}