#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  int a[n],flag=0;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int result;
  cin>>result;
  for(int i=0;i<n;i++){
    if(a[i]==result){
      flag=1;
      break;
    }
  }
  if(flag==1){
    cout<<"She passed her exam";
  }
  else{
    cout<<"She failed";
  }
    return 0;
}