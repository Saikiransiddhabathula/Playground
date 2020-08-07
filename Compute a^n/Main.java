def power(a,n):
  if(n==0):
    return a**n
  else:
    return a * power(a,n-1)
    
    
a=int(input("Enter the value of a\n"))
n=int(input("Enter the value of n\n"))
power(a,n)
print("The value of",a,"power",n,"is",power(a,n))