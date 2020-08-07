#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int r,c,i,j,sum=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(j=0;j<c;j++){
    sum=sum+a[0][j];
  }
  for(i=1;i<=r-2;i++){
    for(j=c-2;j>0;j--){
      sum = sum + a[i][j];
    }
  }
  for(j=0;j<c;j++){
    sum = sum + a[r-1][j];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  return 0;
}