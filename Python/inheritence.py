class Animal:
    alive = True
    
    def eat(self):
        print('this animal is eating')

    def sleep(self):
        print('this animal is sleeping')
        
class Rabbits(Animal):
        def run(self):
            print('this Rabbit is running')
            
class Fish(Animal):
    def swim(self):
        print('this fish is swimming')


class Hawk(Animal):
    def fly(self):
        print('this hawk is flying')
        
rabbit = Rabbits()
fish = Fish()
hawk =  Hawk()

print (rabbit.alive)
fish.eat()
hawk.sleep()

rabbit.run()
fish.swim()
hawk.fly()
