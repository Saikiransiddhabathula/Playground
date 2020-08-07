def gcd(n1,n2,n3):
  small= min(n1,n2,n3)
  while(small>=1):
    if((n1%small==0) and (n2%small==0) and (n3%small==0)):
      gcd1=small
      break
    else:
      small=small-1
  if(gcd1 == result):
    print("Answer is correct.")
  else:
    print("Answer is wrong.")
  
n1=int(input())
n2=int(input())
n3=int(input())
result = int(input())
g = gcd(n1,n2,n3)