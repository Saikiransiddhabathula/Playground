def expo(m,n):
  power = m**n
  if(power >= req):
    print("Doctor, you can proceed with your experiment.")
  else:
    print("Sorry Doctor! You need more bacteria.")
  
m=int(input())
n=int(input())
req=int(input())
e = expo(m,n)