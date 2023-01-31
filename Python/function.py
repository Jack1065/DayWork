#def hello(name):
    #print("Hello World " + name)

#my_name = input("Enter your name: ")

#hello(my_name)

def add(*args):
    sum = 0
    for i in args:
        sum+= i
    return sum
print(add(1,2,3,4,5,6,7,8,9))

def hello(**kwargs):
    for key, value in kwargs.items():
        print(value, end=" ")
        
hello("jack", "err", 'kurtz')