#include<iostream>
using namespace std;
struct Emp
{
  char name[30];
  int id;
  int age;
  char desig[50];
  float salary;
};
int main()
{
  //Type your code here.
  Emp e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.desig;
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desig;
  cout<<"\nSalary of the Employee : "<<e.salary;
}