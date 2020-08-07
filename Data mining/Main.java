num = int(input())
odd=[]
even=[]
while(num>0):
  rem=num%10
  if(rem%2==0):
    even.append(rem)
  else:
    odd.append(rem)
  num = num//10
even_sum=sum(even)
odd_sum=sum(odd)
if(even_sum==odd_sum):
  print("Yes")
else:
  print("No")