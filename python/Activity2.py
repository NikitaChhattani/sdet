num=int(input("Enter an integer value :"))

print("Checking it is even or odd ? ")

if(num%2==0):
    txt="{} is an even number"
else:
    txt="{} is an odd number"

    print(txt.format(num))