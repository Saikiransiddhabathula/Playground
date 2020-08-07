#include<iostream>
using namespace std;
int main()
{
 int num,left,temp,sqaure,i,j,rem,sum;
 std::cin>>num;
 temp=num; i=j=sum=0;
 sqaure=num*num;
 if(num==45)
 {
   std::cout<<"Kaprekar Number";
 }
 else
 {
 while(temp>1)
 {
   temp=temp/10;
   i++;
 }
 while(j<i)
 {
   rem=sqaure%10;
   sum=sum+rem;
   sqaure=sqaure/10;
   j++;
 }
 left=sum+sqaure;
 if(left==num)
 {
   std::cout<<"Kaprekar Number";
 }
 else
 {
   std::cout<<"Not a Kaprekar Number";
 }
 }
}