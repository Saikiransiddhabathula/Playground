num = int(input())
temp=num
for row in range(1,5):
  for column in range(row):
    print(num,end="")
  num = num+1
  print("")
for row1 in range(4,0,-1):
  for column in range(row1):
    print(num-1,end="")
  num = num-1
  print("")