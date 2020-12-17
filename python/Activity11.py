
fruits={
    "Mango"  :10,
    "Banana" :30,
    "Apple"  :40,
    "Kiwi"   :40,
}

choice=input("Enter fruit name you are looking for :")

for fruit in fruits:
    if(fruit==choice):
        print(choice,"is available")
