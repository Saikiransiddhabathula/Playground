#include <iostream>
using namespace std;
int main() 
{
   // Try out your code here
  int r,c;
  cin>>r>>c;
  int a[r][c],b[r][c],d[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>b[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      d[i][j]=a[i][j]+b[i][j];
      cout<<d[i][j]<<" ";
    }
    cout<<"\n";
  }
}