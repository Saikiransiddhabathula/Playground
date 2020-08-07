#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str1;
  string str2;
  getline(cin,str1);
  getline(cin,str2);
  if(str1==str2){
    cout<<"It is correct";
  }
  else {
    cout<<"It is wrong";
  }
}