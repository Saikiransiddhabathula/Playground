#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int max=a[0];
  for(int i=0;i<n;i++)
  {
    if(a[i]>max){
      max=a[i];
    }
    }
  cout<<max;
  // Type your code here
}