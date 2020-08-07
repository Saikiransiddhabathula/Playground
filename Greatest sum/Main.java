#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,i,j,row_ind=0,col_ind=0;
  cin>>n>>m;
  int a[n][m],r[m],c[m];
  
  for(i=0;i<n;i++){
    for(j=0;j<m;j++){
      cin>>a[i][j];
    }
  }
  
  cout<<"Sum of rows is ";
  for(i=0;i<n;i++){
    int row_sum=0;
    for(j=0;j<m;j++){
      row_sum =row_sum + a[i][j];
    }
    r[i] = row_sum;
    cout<<row_sum<<" ";
  }
  
  int max_row = r[0];
  for(i=1;i<m;i++){
    if(r[i]>max_row){
      max_row = r[i];
      row_ind=i;
    }
  }
  cout<<"\nRow "<<row_ind+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(i=0;i<m;i++){
    int col_sum =0;
    for(j=0;j<n;j++){
      col_sum = col_sum + a[j][i];
    }
    c[i] = col_sum;
    cout<<col_sum<<" ";
  }
  int max_col = c[0];
  for(i=1;i<m;i++){
    if(c[i]>max_col){
      max_col = c[i];
      col_ind = i;
    }
  }
  cout<<"\nColumn "<< col_ind+1<<" has maximum sum";
  return 0;
}