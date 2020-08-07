#include<iostream>
#include<bits/stdc++.h> 
#include<string>
using namespace std;
struct College
{ 
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
}; 
int main()
{
  //Type your code here.
  College c[100];
  int n,i,j;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  char x[n][30];
  char t[30];
  for(i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin.ignore();
    cin.getline(c[i].name,30);
    strcpy(x[i], c[i].name);
    cout<<"\nEnter city";
    cin.getline(c[i].city,30);
    cout<<"\nEnter year of establishment";
    cin>>c[i].establishmentYear;
    cout<<"\nEnter pass percentage\n";
    cin>>c[i].passPercentage;
  }
  
  for(i=0;i<n;i++){
      for(j=0;j<n-i-1;j++)
      {
        if(strcmp(x[j],x[j+1])>0){
            strcpy(t, x[j]);
            strcpy(x[j], x[j+1]);
            strcpy(x[j+1], t);
        }                 
      }
    }
  cout<<"Details of colleges\n";
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      if(strcmp(x[i],c[j].name)==0){
        cout<<"College:"<<i+1<<endl;
        cout<<"Name:"<<c[j].name<<endl;
        cout<<"City:"<<c[j].city<<endl;
        cout<<"Year of establishment:"<<c[j].establishmentYear<<endl;
        cout<<"Pass percentage:"<<c[j].passPercentage<<endl;
      }
    }
  }
  
}