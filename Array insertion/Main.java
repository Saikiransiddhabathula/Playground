#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,loca,value,temp;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n],b[n+1];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loca;
  if(loca>n || loca<0){
    cout<<"Invalid Input";
  }
  else{
  cout<<"Enter the value to insert\n";
  cin>>value;
  for(int i=n-1;i>=loca-1;i--){
    a[i+1]=a[i];
  }
    a[loca-1]=value;
  cout<<"Array after insertion is\n";
    for(int i =0;i<=n;i++){
      cout<<a[i]<<"\n";
    }
  }
}