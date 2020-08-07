def gcd1(small,n2):
  if(small==1):
    return small
  while(n1%small==0 and n2%small==0):
    return small
  return gcd1(small-1,n2)
  
n1=int(input())
n2=int(input())
if(n1>=n2):
  small=n2
  gcd1(small,n1)
else:
  small=n1
  gcd1(small,n2)
print("G.C.D of",n1,"and",n2,"=",gcd1(small,n2))
 