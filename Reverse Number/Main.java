#include <iostream>
int main() 
{
	// Type your code here
  int num,temp;
  std::cin>>num;
  while(num>0){
    temp =  num%10;
    std::cout<<temp;
    num = num/10;
  }
}