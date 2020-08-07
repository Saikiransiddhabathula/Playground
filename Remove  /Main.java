#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  string word="the";
  getline(cin,str);
  if(str.find(word) != string::npos){
    size_t p= -1;
    string tempWord = word + " ";
    while((p=str.find(word))!= string::npos)
      str.replace(p,tempWord.length(),"");
  }
  cout<<str;
}