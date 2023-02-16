from abc import ABC, abstractmethod


class Vehicle(ABC):
    @abstractmethod
    def go(self):
        pass
    
class Car(Vehicle):
    def go(self):
        print("Car is going")
        
class Truck(Vehicle):
    def go(self):
        print("Truck is going")
        
class Bus(Vehicle):
    def go(self):
        print("Bus is going")
        
car = Car()
truck = Truck()
bus = Bus()

car.go()
truck.go()