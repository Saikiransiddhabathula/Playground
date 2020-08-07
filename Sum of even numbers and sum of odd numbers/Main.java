#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum_even=0,sum_odd=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  for(int i=0;i<n;i++){
    if(a[i]%2==0){
      sum_even = sum_even + a[i];
    }
    else{
      sum_odd = sum_odd + a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sum_even<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sum_odd;
}