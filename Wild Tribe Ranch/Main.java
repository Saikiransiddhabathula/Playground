#include<iostream>
int main()
{
  int weight,florence;
  std::cin>>weight>>florence;
  if(weight>florence)
    std::cout<<"Yes, you can enter.";
  else if(weight==florence)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}