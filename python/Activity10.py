numbers=tuple(input("Enter numbers in tuple :").split(","))

print("Numbers under tuple are :",numbers)

print("Divisible by 5 numbers are :")

for num in numbers:

    if(int(num)%5==0):
        
        print(num)
       
        
