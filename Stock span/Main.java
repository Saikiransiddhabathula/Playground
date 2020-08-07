#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,j=1,result;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int temp=a[0];
  cout<<1<<"\n";
  for(int i=0;i<n-1;i++){
    if(a[i]>a[i+1]){
      cout<<1<<"\n";
    }
    else{
      result = 2 * j;
      j=j+1;
      cout<<result<<"\n";
    }
  }
}