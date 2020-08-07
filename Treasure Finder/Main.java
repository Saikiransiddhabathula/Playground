#include<iostream>
using namespace std;
int main()
{
int a,b,c;
int x,y,z,i,t;
cin>>a>>b>>c;
x=a;
y=b;
z=c;
if(a >= b && a >= c)
{
if(b >= c)
{
cout<<"The treasure is in box which has number "<<b<<"\n";
}
else
{
cout<<"The treasure is in box which has number "<<c<<"\n";              }
}
else if(b >= a && b >= c)
{
if(a >= c)
{
cout<<"The treasure is in box which has number "<<a<<"\n";
}
else
{
  cout<<"The treasure is in box which has number "<<c<<"\n";
}
}
else if(a >= b)
{
cout<<"The treasure is in box which has number "<<a<<"\n";
}
else
{
 cout<<"The treasure is in box which has number "<<b<<"\n";
} 
for(i=1;i<=5;i++){
if(x%i==0 && b%i==0 && c%i==0){
 t=i;
}
}
std::cout<<"The code to open the box is "<<t;
} 
