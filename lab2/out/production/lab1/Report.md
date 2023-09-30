# Topic: *SOLID Principles*

## Author: Nistor Stefan

----

## Objectives:

* Study and understand the SOLID Principles.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Create a sample project that respects SOLID Principles.

## Main tasks:
* Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).

* Select a domain area for the sample project.

* Define the main involved classes and think about what instantiation mechanisms are needed.

* Respect SOLID Principles in your project.



## Theory:
&ensp; SOLID is a set of five object-oriented design principles intended to make software designs more maintainable, flexible, and easy to understand. The acronym stands for Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle. Each principle addresses a specific aspect of software design, such as the organization of responsibilities, the handling of dependencies, and the design of interfaces. By following these principles, software developers can create more modular, testable, and reusable code that is easier to modify and extend over time. These principles are widely accepted and adopted in the software development community and can be applied to any object-oriented programming language.


## Implementation
__SRP (Single Responsibility Principle)__

* __Car, ElectricCar, and Paint classes__ simply define the objects and their properties.
* __StockManager:__ manages the stock of cars, paints, etc.
* __DealerActionHandler and CustomerActionHandler:__ handle actions specific to them.
* __CarFactory:__ is responsible for creating cars.

Thus, each class/component retains a single, focused responsibility.

__OCP (Open/Closed Principle)__

* By creating subclasses (like ElectricCar as a subclass of Car), I can add more features and properties to specific types of cars without changing the basic Car class.

__LSP (Liskov Substitution Principle)__

* With the addition of subclasses like ElectricCar, I am respecting this principle. As ElectricCar is a type of Car, anywhere you expect a Car, an ElectricCar could be used.

__ISP (Interface Segregation Principle)__

* By having interfaces like __IStockManager__, I ensure that classes implementing this interface won't have to implement methods they don't use.


__DIP (Dependency Inversion Principle)__

* My system depends on abstractions and not on concrete details. For instance, by relying on the IStockManager interface instead of a concrete StockManager class, I've made sure high-level modules are not directly dependent on low-level modules.


## Output:
```
Login as: 
1. Dealer 
2. Customer 
3. Exit
1
Choose an action: 
1. Add Car to Stock 
2. Add Paint to Stock 
3. Add Part to Stock 
4. Remove Paint from Stock 
5. Remove Part from Stock 
6. Exit
1
Enter Car Model (SEDAN, SUV, TRUCK, HATCHBACK):
SEDAN
Choose an action: 
1. Add Car to Stock 
2. Add Paint to Stock 
3. Add Part to Stock 
4. Remove Paint from Stock 
5. Remove Part from Stock 
6. Exit
6
Login as: 
1. Dealer 
2. Customer 
3. Exit
2
Choose an action: 
1. View Products 
2. Add Car to Wishlist 
3. Exit
2
Enter Car Model to add to wishlist (SEDAN, SUV, TRUCK, HATCHBACK):
SEDAN
Customer added SEDAN to their wishlist.
Choose an action: 
1. View Products 
2. Add Car to Wishlist 
3. Exit
```


## Conclusions / Screenshots / Results
&ensp; In this car dealership project, a modular and object-oriented approach was adeptly applied to manage various functionalities for both dealers and customers. Adherence to the Single Responsibility Principle was evident with each class distinctly managing its own responsibilities, ensuring simplicity and clarity. By utilizing interfaces and subclasses, the system embraced the Open/Closed and Liskov Substitution Principles, allowing for seamless extensibility and ensuring type substitutability. The implementation of specific interfaces like IStockManager showcased the Interface Segregation Principle, ensuring efficient and meaningful class-method relationships. Overall, through a judicious application of the SOLID principles, the project has been sculpted into a robust, scalable, and maintainable system.

