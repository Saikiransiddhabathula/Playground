#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++){
    int max=a[0][i];
    for(int j=1;j<m;j++){
      if(a[j][i]>max){
        max=a[j][i];
      }
    }
    cout<<max<<"\n";
  }
}