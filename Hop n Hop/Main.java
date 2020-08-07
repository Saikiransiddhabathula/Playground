#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,distance;
  std::cin>>x>>y;
  distance = sqrt(pow(x-3,2) + pow(y-4,2));
  std::cout<<distance;
}