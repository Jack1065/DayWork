class Organism:
    alive = True
class Animal(Organism):
    
    def eat (self):
        print("this animal is eating")
        return self
    def sleep (self):
        print("this animal is sleeping")
        return self
 
class Dog(Animal):
       def bark (self):
            print("woof")
            return self
            
            
dog = Dog()
dog.sleep().bark()


