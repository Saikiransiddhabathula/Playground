#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thu,fri,sat,total;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  int b,br,r1,r2,r3,r4,r5,r6,r7,r8=0,ed,ts,td;
  r1 = sun * 150;
  r7 = sat * 125;
  if(mon<=8){
    r2 = mon * 100;
  }
  else if(mon>8){
    b = mon-8;
    br = (b*100)+(b*15);
    r2 = br + 800;
  }
  if(tue<=8){
    r3 = tue*100;
  }
  else if(tue>8){
    b=tue - 8;
    br = (b*100)+(b*15);
    r3 = br + 800;
  }
  if(wed<=8){
    r4 = wed*100;
  }
  else if(wed>8){
    b=wed - 8;
    br = (b*100)+(b*15);
    r4 = br + 800;
  }
  if(thu<=8){
    r5 = thu*100;
  }
  else if(thu>8){
    b=thu - 8;
    br = (b*100)+(b*15);
    r5 = br + 800;
  }
  if(fri<=8){
    r6 = fri*100;
  }
  else if(fri>8){
    b=fri - 8;
    br = (b*100)+(b*15);
    r6 = br + 800;
  }
  td = mon + tue + wed + thu + fri;
  if(td>40)
  {
    ed = td-40;
    r8 = (ed*100) + (ed*25);
  }
  ts = r1+r2+r3+r4+r5+r6+r7+r8;
  cout<<ts;
}