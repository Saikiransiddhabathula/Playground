#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int *a;
  int n,male_count=0,female_count=0;
  cin>>n;
  a = (int *) calloc(n,sizeof(int));
  for(int i=0;i<n;i++){
    cin>>*(a+i);
  }
  for(int i=0;i<n;i++){
    if(*(a+i)%2==0){
      female_count=female_count + 1;
    }
    else{
      male_count = male_count + 1;
    }
  }
  cout<<male_count<<"\n";
  cout<<female_count;
  return 0;
}