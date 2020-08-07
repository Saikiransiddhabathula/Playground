def fibonacci(n):
  if(n<=1):
    return 1
  else:
    return fibonacci(n-1) + fibonacci(n-2)
  
n=int(input())
if(n<=0):
  print("fibonnaci series does not exist")
else:
  print("The term",n,"in the fibonacci series is",fibonacci(n-2))