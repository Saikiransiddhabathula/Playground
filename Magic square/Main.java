#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,dig_sum=0,row_sum=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i==j){
        dig_sum=dig_sum + a[i][j];
      }
      if(i+j+1==n){
        row_sum = row_sum + a[i][j];
      }
    }
  }
  if(dig_sum==row_sum){
    cout<<"Yes";
  }
  else{
    cout<<"No";
  }
}