Player_1=input("Enter player 1 name :")
Player_2=input("Enter player 2 name :")

Choice_player_1=input(Player_1+ " Choose your option from Rock, papar and Scissor :")
Choice_player_2=input(Player_2+ " Choose your option from Rock, paper and Scissor :")

if(Choice_player_1==Choice_player_2):
    print("It'a a tie")

elif (Choice_player_1=="Rock"):
    if(Choice_player_2=="Scissor"):
        print("Rock wins")
    else:
        print("paper wins")
       
elif(Choice_player_1=="Scissor"):
    if(Choice_player_2=="Rock"):
        print("Rock wins")
    else:
        print("paper wins")

elif(Choice_player_1=="Paper"):
    if (Choice_player_2=="Rock"):   
       print("Paper wins")
    else:
       print("Scissor wins")

elif(Choice_player_1=="Rock"):
    if (Choice_player_2=="Paper"):
       print("Paper wins")
    else:
       print("Scissor wins")

else:
    print("Invalid input, you have not entered rock paper scissor")