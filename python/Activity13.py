numbers=list(input("Enter numbers in the list :").split(","))

def sum(numbers):
    addition=0
    
    print("Numbers under list are :",numbers)

    for number in numbers:
        addition=addition+int(number)
    
    return addition
    

print ("Sum is ",sum(numbers))

    