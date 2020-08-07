#include<iostream>
int main()
{
  // Type your code here
  int num,count=0;
  std::cin>>num;
  do{
    int temp=num%10;
    count++;
    num=num/10;
  }while(num>0);
  std::cout<<count;
    
}