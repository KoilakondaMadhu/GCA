
n = 5
for i in range(n+1):
    for j in range(1, i+1):
        print(j, end=' ')
    print()
    
#1 
#1 2 
#1 2 3 
#1 2 3 4 
#1 2 3 4 
    
    
    n = 5
for i in range(n+1):
    for j in range(1, i+1):
        print(i, end=' ')
    print()
    
#1 
#2 2 
#3 3 3 
#4 4 4 4 
#5 5 5 5 5

----reverse

number = int(input("Enter the integer number: "))  
revs_number = 0  
while (number > 0):  
    remainder = number % 10  
    revs_number = (revs_number * 10) + remainder  
    number = number // 10  
print("The reverse number is : {}".format(revs_number))  

---amstrong number
num = int(input("Enter a number: "))
sum = 0
temp = num
while temp > 0:
   digit = temp % 10
   sum += digit ** 3
   temp //= 10
if num == sum:
   print(num,"Armstrong number") 
else:
   print(num,"not  Armstrong number")
