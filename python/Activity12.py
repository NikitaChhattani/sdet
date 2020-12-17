
def sum(num):
    if(num<=1):
        return num
    else:
        return num+sum(num-1)

print("Sum of numbers from 0 to 10 is: ",sum(10))
    

   