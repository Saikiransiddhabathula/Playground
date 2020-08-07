num1=int(input())
n1 , n2 = 0 , 1
lis=[]
count = 0
if(num1==1):
  print(num1)
else:
  while(count<num1):
    lis.append(n1)
    nth = n1+n2
    n1=n2
    n2=nth
    count+=1
  print(lis[-1])