def digitroot(n):
  if(n<10):
    return n
  else:
    num1 = str(n)
    sum1=0
    for i in range(len(num1)):
      sum1 = sum1 + int(num1[i])
    return digitroot(sum1)
      
n=int(input())
print(digitroot(n))