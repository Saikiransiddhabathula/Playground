#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int weight,adults,children;
  cin>>weight>>adults>>children;
  if(adults*75<=weight){
    if(((children*30)+(adults*75))<=weight)
    {
      cout<<"Boat is stable";
    }
    else
    {
      cout<<"Boat will drow";
    }
  }
    else
    {
      cout<<"Boat will drow";
    }
}