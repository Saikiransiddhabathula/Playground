def armstrong(n):
  count = str(n)
  result = []
  m = len(count)
  for i in range(m):
    sum1 = int(count[i])**m
    result.append(sum1)
  if(sum(result)==n):
    print("Kindly proceed with encrypting")
  else:
    print("It is not an Armstrong number")
    
  
n = int(input())
a = armstrong(n)
