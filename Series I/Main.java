num = int(input())
lis=[0.5]
result=0.5
for i in range(0,num):
  result = result + pow(3,i)
  lis.append(result)
for j in range(num):
  print(lis[j],end=' ')