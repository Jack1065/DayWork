class Duck:
    def walk(self):
        print("The duck is walking")
    def talk(self):
        print("The duck is talking")
        

class chicken:
    def walk(self):
        print("The chicken is walking")
    def talk(self):
        print("The chicken is talking")

class Person():
    def catch(self, duck):
        duck.walk()
        duck.talk()
        print("you caught the duck")

duck = Duck()
chicken = chicken()
person= Person()


person.catch(duck)
