import os


path = 'test.txt'

def filecheck(path):
    if os.path.exists(path):
        print("that file already exists")
        if(os.path.isfile(path)):
            print("path is a file")
        elif(os.path.isdir(path)):
            print("path is a directory")
    else:
        print("file doesnt exist")

with open(path) as file:
    print(file.read())
