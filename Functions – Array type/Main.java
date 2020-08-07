#include<iostream>
using namespace std;
int type_fun(int n,int *a)
{
  int i ;
  int odd=0,even=0;
  for(i=0;i<n;i++){
    if(a[i]%2==0){
      even+=1;
    }
    else if(a[i]%2==1){
      odd+=1;
    }
    else{
      return 3;
    }
  }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
    
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  switch(type_fun(n,a)){
    case 1:
      cout<<"The array is Even";
      break;
    case 2:
      cout<<"The array is Odd";
      break;
    case 3:
      cout<<"The array is Mixed";
      break;
    default:
      cout<<"Invalid input";
      break;
  } 
}
