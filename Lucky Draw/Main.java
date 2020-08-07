num = int(input())
if(num==2):
  print("Eligible")
if num > 1:
  for i in range(3,num):
    if (num % i) == 0:
      print("Not eligible")    
      break  
    else:
      print("Eligible")
      break
else:
  print("Not eligible")  