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
    int row_sum=0;
    for(int j=0;j<m;j++){
      row_sum=row_sum + a[i][j];
    }
    cout<<row_sum<<"\n";
  }
}