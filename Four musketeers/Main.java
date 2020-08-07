#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,x3,y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float pos1,pos2;
  pos1 = (float)(x1+x2+x3)/3;
  pos2 = (float)(y1+y2+y3)/3;
  std::cout<<pos1<<"\n";
  std::cout<<pos2;
}