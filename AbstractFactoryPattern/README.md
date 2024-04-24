abstract factory pattern

The Abstract Factory Pattern creates other factories around a super factory. The Gigafactory is also known as the factory of other factories. This type of design pattern is a creational pattern, which provides an optimal way to create objects.

In the abstract factory pattern, the interface is a factory responsible for creating a related object without explicitly specifying their class. Each generated factory can provide objects according to the factory pattern.
introduce

Intent: Provide an interface for creating a series of related or interdependent objects without specifying their concrete classes.

Main solution: Mainly solve the problem of interface selection.

When to use: The system's products have more than one product family, and the system only consumes products from one of the families.

How to solve: Define multiple products in a product family.

Key code: Aggregate multiple similar products in a factory.

Application example: After working, in order to attend some parties, you must have two or more sets of clothes, such as business clothes (complete sets, a series of specific products), fashion clothes (complete sets, a series of specific products), or even for a family For example, there may be business women's clothing, business men's clothing, fashionable women's clothing, and fashionable men's clothing. These are also complete sets, that is, a series of specific products. Assume a situation (which does not exist in reality, otherwise, there is no way to enter communism, but it is helpful to illustrate the abstract factory model). In your home, a certain wardrobe (concrete factory) can only store a certain kind of such Clothes (set, a series of specific products), every time you pick up this set of clothes, you will naturally take them out of this wardrobe. Use OO thinking to understand that all wardrobes (concrete factories) are wardrobes (abstract factories), and each set of clothes includes specific tops (a specific product), pants (a specific product) product), these concrete tops are actually tops (an abstract product), and the concrete pants are also pants (another abstract product).

Advantages: When multiple objects in a product family are designed to work together, it ensures that the client always uses only objects from the same product family.

Disadvantages: Product family expansion is very difficult. To add a certain product of a series, you need to add code to the abstract Creator as well as to the specific one.

Usage scenarios: 1. QQ skin change, the whole set is changed together. 2. Generate programs for different operating systems.

Note: Product families are difficult to expand, but product levels are easy to expand.
accomplish

We will create Shape and Color interfaces and entity classes that implement these interfaces. The next step is to create the abstract factory class AbstractFactory. Then define factory classes ShapeFactory and ColorFactory, both of which extend AbstractFactory. Then create a factory creator/generator class FactoryProducer.

AbstractFactoryPatternDemo, our demo class uses a FactoryProducer to obtain an AbstractFactory object. It will pass shape information Shape (CIRCLE / RECTANGLE / SQUARE) to the AbstractFactory in order to get the type of object it needs. At the same time, it also passes color information Color (RED / GREEN / BLUE) to AbstractFactory in order to obtain the type of object it requires.
UML diagram of abstract factory pattern
step 1

Create an interface for the shape.

Shape.java

public interface Shape {
    void draw();
}

Step 2

Create an entity class that implements the interface.

Rectangle.java

public class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
}

Square.java

public class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }
}

Circle.java

public class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Circle::draw() method.");
    }
}

Step 3

Create an interface for colors.

Color.java

public interface Color {
    void fill();
}

Step 4

Create an entity class that implements the interface.

Red.java

public class Red implements Color {

    @Override
    public void fill() {
       System.out.println("Inside Red::fill() method.");
    }
}

Green.java

public class Green implements Color {

    @Override
    public void fill() {
       System.out.println("Inside Green::fill() method.");
    }
}

Blue.java

public class Blue implements Color {

    @Override
    public void fill() {
       System.out.println("Inside Blue::fill() method.");
    }
}

Step 5

Create abstract classes for Color and Shape objects to obtain factories.

AbstractFactory.java

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

Step 6

Create a factory class that extends AbstractFactory to generate objects of entity classes based on given information.

ShapeFactory.java

public class ShapeFactory extends AbstractFactory {
    
    @Override
    public Shape getShape(String shapeType){
       if(shapeType == null){
          return null;
       }
       if(shapeType.equalsIgnoreCase("CIRCLE")){
          return new Circle();
       } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
          return new Rectangle();
       } else if(shapeType.equalsIgnoreCase("SQUARE")){
          return new Square();
       }
       return null;
    }
   
    @Override
    Color getColor(String color) {
       return null;
    }
}

ColorFactory.java

public class ColorFactory extends AbstractFactory {
    
    @Override
    public Shape getShape(String shapeType){
       return null;
    }
   
    @Override
    Color getColor(String color) {
       if(color==null){
          return null;
       }
       if(color.equalsIgnoreCase("RED")){
          return new Red();
       } else if(color.equalsIgnoreCase("GREEN")){
          return new Green();
       } else if(color.equalsIgnoreCase("BLUE")){
          return new Blue();
       }
       return null;
    }
}

Step 7

Create a factory creator/generator class that gets the factory by passing shape or color information.

FactoryProducer.java

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
       if(choice.equalsIgnoreCase("SHAPE")){
          return new ShapeFactory();
       } else if(choice.equalsIgnoreCase("COLOR")){
          return new ColorFactory();
       }
       return null;
    }
}

Step 8

Use FactoryProducer to get the AbstractFactory and get the object of the entity class by passing the type information.

AbstractFactoryPatternDemo.java

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

       //Get shape factory
       AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

       //Get the object with shape Circle
       Shape shape1 = shapeFactory.getShape("CIRCLE");

       //Call the draw method of Circle
       shape1.draw();

       //Get the object with shape Rectangle
       Shape shape2 = shapeFactory.getShape("RECTANGLE");

       //Call the draw method of Rectangle
       shape2.draw();
      
       //Get the object with shape Square
       Shape shape3 = shapeFactory.getShape("SQUARE");

       //Call the draw method of Square
       shape3.draw();

       //Get color factory
       AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

       //Get the object with color Red
       Color color1 = colorFactory.getColor("RED");

       //Call Red's fill method
       color1.fill();

       //Get the object with color Green
       Color color2 = colorFactory.getColor("Green");
