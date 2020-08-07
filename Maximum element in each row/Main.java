#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++){
    int max=a[i][0];
    for(int j=0;j<m;j++){
      if(a[i][j]>=max){
        max=a[i][j];
      }
    }
    cout<<max<<"\n";
  }
}