list1=list(input("Enter numbers for list 1: ").split(","))
list2=list(input("Enter numbers for list 2: ").split(","))
OddList=[]
EvenList=[]
NewList=[]


print("List 1 digits are :",list1)
print("List 2 digits are :",list2)

print("Checking odd numbers from first list")

for num in list1:
    if(int(num)%2 != 0):
        OddList.append(num)
        
print("OddList digits are :",OddList)

print("Checking Even numbers from second list")

for number in list2:
     if(int(number) % 2 == 0):
        EvenList.append(number)

print("EvenList digits are :",EvenList)

NewList=OddList+EvenList

print("Third list digits are :", NewList)
        