num=int(input())
for i in range(1,num+1):
  for j in range(1,i+1):
    if(j<i):
      print(str(i)+"*",end="")
    else:
      print(i,end="")
  print("")
for i in range(num,0,-1):
  for j in range(1,i+1):
    if(j<i):
      print(str(i)+"*",end="")
    else:
      print(i,end="")
  print("")
  