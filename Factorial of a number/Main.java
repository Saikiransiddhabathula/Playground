#include<iostream>
int main(){
  // Type your code here
  int num,fact=1;
  std::cin>>num;
  for(int i=1;i<=num;i++){
    fact=fact*i;
  }
  std::cout<<fact;
}