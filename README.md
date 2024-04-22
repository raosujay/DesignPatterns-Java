#DesignPatterns - Java

**Introduction to design patterns**

Design patterns represent best practices and are commonly used by experienced object-oriented software developers. Design patterns are solutions to common problems faced by software developers during the software development process. These solutions are the result of trial and error by numerous software developers over a long period of time.

A design pattern is a set of code design experiences that have been used repeatedly, are known to most people, and are classified and cataloged. The purpose of using design patterns is to reuse code, make the code easier to understand by others, and ensure code reliability. There is no doubt that design patterns are win-win for ourselves, others, and the system. Design patterns make code compilation truly engineering. Design patterns are the cornerstone of software engineering, just like the bricks and stones of a building. Reasonable use of design patterns in projects can perfectly solve many problems. Each pattern has corresponding principles in reality to correspond to it. Each pattern describes a problem that keeps recurring around us, and the solution to the problem. Core solution, which is why design patterns can be widely used.
What is GOF (Gang of Four)?

In 1994, Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides co-authored a book called Design Patterns - Elements of Reusable Object-Oriented Software (Chinese translation: Design Patterns - Reusable Object-Oriented Software Elements) book, which first mentioned the concept of design patterns in software development.

The four authors are collectively known as GOF (Gang of Four). The design patterns they proposed are mainly based on the following object-oriented design principles.

     Program the interface rather than the implementation.
     Prefer object composition over inheritance.

**Use of design patterns**

There are two main uses of design patterns in software development.
A common platform for developers

Design patterns provide a standard system of terminology that is context-specific. For example, the singleton design pattern means using a single object so that all developers familiar with the singleton design pattern can use the single object and can tell each other that the program uses the singleton pattern.
best practices

Design patterns have evolved over a long period of time and they provide optimal solutions to common problems faced during software development. Learning these patterns helps less experienced developers learn software design in a quick and easy way.
Types of design patterns

According to the design pattern reference book Design Patterns - Elements of Reusable Object-Oriented Software (Chinese translation: Design Patterns - Reusable Object-Oriented Software Elements), there are a total of 23 design patterns. These patterns can be divided into three major categories: Creational Patterns, Structural Patterns, and Behavioral Patterns. Of course, we'll also discuss another category of design patterns: J2EE design patterns.
Serial Number Pattern & Description Included

1 **Creational model**
These design patterns provide a way to hide the creation logic while creating an object, rather than instantiating the object directly using the new operator. This allows the program to be more flexible in determining which objects need to be created for a given instance.

     Factory Pattern
     Abstract Factory Pattern
     Singleton Pattern
     Builder Pattern
     Prototype Pattern

2 **Structural pattern**
These design patterns focus on the composition of classes and objects. The concept of inheritance is used to compose interfaces and define the way in which composed objects acquire new functionality.

     Adapter Pattern
     Bridge Pattern
     Filter pattern (Filter, Criteria Pattern)
     Composite Pattern
     Decorator Pattern
     Facade Pattern
     Flyweight Pattern
     Proxy Pattern

3 **Behavioral patterns**
These design patterns focus specifically on communication between objects.

     Chain of Responsibility Pattern
     Command Pattern
     Interpreter Pattern
     Iterator Pattern
     Mediator Pattern
     Memento Pattern
     Observer Pattern
     State Pattern
     Null Object Pattern
     Strategy Pattern
     Template Pattern
     Visitor Pattern

4 **J2EE mode**
These design patterns focus specifically on the presentation layer. These modes are certified by Sun Java Center.

     MVC Pattern
     Business Delegate Pattern
     Composite Entity Pattern
     Data Access Object Pattern
     Front Controller Pattern
     Intercepting Filter Pattern
     Service Locator Pattern
     Transfer Object Pattern

The following uses a picture to overall describe the relationship between design patterns:

The relationship between design patterns
**Six principles of design patterns**

1. **Open Close Principle**

The open-closed principle means: open for expansion, closed for modification. When the program needs to be expanded, the original code cannot be modified to achieve a hot-swappable effect. In short, it is to make the program scalable and easy to maintain and upgrade. To achieve this effect, we need to use interfaces and abstract classes, which we will mention in the specific design later.

2. **Liskov Substitution Principle**

Liskov substitution principle is one of the basic principles of object-oriented design. The Liskov Substitution Principle says that wherever a base class can appear, a subclass can definitely appear. LSP is the cornerstone of inheritance reuse. Only when the derived class can replace the base class and the function of the software unit is not affected, the base class can be truly reused, and the derived class can also add new ones on the basis of the base class. Behavior. Liskov substitution principle is a supplement to the opening and closing principle. The key step to realize the opening and closing principle is abstraction, and the inheritance relationship between base classes and subclasses is the specific implementation of abstraction, so the Liskov substitution principle is a specification for the specific steps to achieve abstraction.

3. **Dependence Inversion Principle**

This principle is the basis of the opening and closing principle. The specific content: programming for interfaces relies on abstraction rather than concreteness.

4. **Interface Segregation Principle**

This principle means: It is better to use multiple isolated interfaces than to use a single interface. It also has another meaning: reducing the coupling between classes. It can be seen that design patterns are actually software design ideas that start from large-scale software architecture and are easy to upgrade and maintain. It emphasizes reducing dependencies and reducing coupling.

5. **Demeter's law, also known as the least known principle (Demeter Principle)**

The principle of least known means that an entity should interact with other entities as little as possible so that the system functional modules are relatively independent.

6. **Composite Reuse Principle**

The principle of composition and reuse means: try to use composition/aggregation instead of inheritance.
