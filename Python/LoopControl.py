#while True:
    #name = input("What is your name? ")
    #if name != "":
        #break 
phone_number = "262-616-3544"

for i in phone_number:
    if i == "-":
        continue
    print(i,end="")
    
for i in range(1,21):
    if i == 13:
        pass
    else: print(str(i) + " ",end="")
