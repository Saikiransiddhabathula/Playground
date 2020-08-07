num = int(input())
lis=[]
for i in range(1,num+1):
  if(i%2==0):
    res = (i*i)-2
    lis.append(res)
  else:
    res = (i*i)-1
    lis.append(res)
for j in range(num):
  print(lis[j],end=" ")