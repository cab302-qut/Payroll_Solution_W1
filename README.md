<h1 align="center">WEEK 1 EXTENSION EXERCISE</h1>

<h1 align="center">PAYROLL APPLICATION</h1>

![Image of digital block with shapes](/images/Payroll.jpeg)

> [!NOTE]
In the first practical we revised OOP design principles. This extension exercise will help to reinforce the OOP Design Principles discussed in the fitst practical.

> [!TIP]
> If you are unfamiliar with UML Class Diagrams then refer to the **UML Class Diagram Essentials** on Canvas - Activity 1.3

![UML Class Diagram for implementation of Payroll Application.](/images/SimplePayrollApplication_Custom.png)


## Classes

1. Employee Class - Abstract Class - Base class from which both SalariedEmployee and HourlyEmployee inherit from. With inheritance you can derive a new class from the base class and all the attributes and methods are automatically inherited from Employee class by the SalariedEmployee and HourlyEmployee Class. Inheritance is one of the four pillars of Object Orienting Programming (OOP)  and allows large scale reuse. An inherited class is called a subclass or child class (SalariedEmployee and HourlyEmployee) of the class it inherits from (Employee Class). The class being inherited is called either a parent class, superclass, or base class.
2. Company Class - Each employee has a relationship to the company they work for - this is a special type of relationship called Aggregation. These two objects (Company and Employee) are related to each other but they are not dependent on each other. The Company object can survive without the Employee object and vice versa. In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity. Recommend Google if you want to know more.
3. Payable Interface - The Employee Class will directly implement the Payable Interface.
4. Contractor Class - Will also directly implement Payable Interface.
5. Address Class - Simple concrete class - An employee object will require an Address object - there is a dependency in that each Employee object has an address (an Address object as defined by the Address Class). The Company Class also has a dependency on the Address class as a Company object has an Address object as an attribute.
## Underlined attributes
+ In the Employee Class you will see that nextID is underlined - this means the attribute is declared as static (belongs to the class and not the object).
+ Also in the Employee Class is STARTING_PAY_RATE and this is underlined so it is also static. The all capitals signifies it is a constant - in Java a constant is defined by using the final keyword. EMPLOYEE_ID is also all capitals so again this should be declared as final. Methods may also be static and you will notice the getNextID() method is underlined therefore it should be declared as a static method. To help you get started the Employee Class would have the following attribute declarations:

```
public abstract class Employee implements Payable {

    private String name;
    private final int EMPLOYEE_ID;
    private Address address;
    private double payRate;
    private static int nextID = 1000;
    public static final double STARTING_PAY_RATE = 7.75;

```
## Part A: Implement Payable Interface
When implementing the various classes for this project it would be a good idea to have the UML Class diagram on a second monitor or to share the UML Class diagram with IntelliJ on the same screen - this will make the implementation a little easier.

You will need to create a number of Java classes and we create these classes in org.payroll.hr package (or whatever you name you chose). Click on the org.payroll.hr package and then select File-->New-->Java Class. You will be given options of different types of files to create and in this case we want to create an Interface called Payable. You should see the Payable Interface appear in the org.payroll.hr package - notice it has an icon signifying it is an interface (circle with an I inside) which is different to the Main class which has an icon signifying it is a class (circle with a C inside). A narration will also appear asking if you want to add this new file to the Git repository - answer Yes to this. You will note that the Main class and the Payable Interface all have the same package name at the top of the file. Package names simply used to group related classes. 

Now you have created the Payable Interface you need to declare the methods as per the UML Class diagram. Interfaces are simply a contract - interfaces define methods that other classes must implement if they are to implement the interface. An interface just defines a group of related methods with only the method signature and no actual implementation. The Payable Interface only has two methods.

## Part B: Implement Employee Abstract Class
The attribute nextID is a static variable and we will initialise this when we declare it as this will autoincrement when a new Employee object is created (initialise this variable to 1000). We will also intialise STARTING_PAY_RATE - all capitals means that it is a constant so we declare this variable as final and it is underlined so it should be declared static. Set this attribute to 7.75.

Attempt to implement the Employee class remembering this is an abstract class and it implements the Payable interface. Follow the UML Class diagram so you declare all the required attributes and methods. Note that this class has 2 constructors - A class can have multiple constructors, which is called constructor overloading. This allows for flexibility when creating objects by providing different ways to initialize them. 

One final point - the Employee class makes use of the Address Class which has not been implemented as yet so IntelliJ IDEA will highlight this object type red - it will rectify itself once we implement the Address Class.

## Part C: Implement Address & Company Classes
These should be a very straight forward classes to implement.

# CHALLENGE:
## Part D: Implement **Contractor Class**, **SalariedEmployee Class**, and **HourlyEmployee Class**.
These three classes will be the most challenging of all the classes in the current UML Class diagram to implement. There are a few points to remember.

+ **HourlyEmployee Class** and **SalariedEmployee Class** both inherit from the **Employee Class**.
+ In addition, the **Employee Class** implements the **Payable Interface**.
+ The result is that the **SalariedEmployee** and the **HourlyEmployee Classes** will need to implement the methods defined in the **Payable Interface**. If you use IntelliJ IDEA to do the heavy lifting, it will assist you in the implementation process. There are some video demonstrations on Canvas.
+ Remember to use the super keyword to satisfy the constructor of the parent class.
+ The **Contractor Class** is fairly straight forward as it only implements the **Payable Interface**.
