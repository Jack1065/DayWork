try:
    numerator = int(input("Enter numerator: "))
    denominator = int(input("Enter denominator: "))
    result = numerator / denominator
    print(result)
    
except ZeroDivisionError as e:
    print(e)
    print("you can't divide by zero")
    
except ValueError as e:
    print(e)
    print("enter numbers only")

else:
    print(result)


    

#except Exception:
    #print("Invalid input")

    