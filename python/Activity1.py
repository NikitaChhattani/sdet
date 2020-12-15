name=input("Enter your name :")
Age= input("Enter your Age :")

Current_year=2020
Ageto100=Current_year+(100-int(Age))

txt="Hi "+name+" you will turn 100 years old in {}"
print(txt.format(Ageto100))
