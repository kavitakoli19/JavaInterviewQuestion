https://refactoring.guru/design-patterns/java


# Examples of Design patter

#### Reference :: https://www.java67.com/2012/09/top-10-java-design-pattern-interview-question-answer.html

## Decorator Design pattern:
  - java.io package. BufferedReader and BufferedWriter 
 
## Stratergy Desgign Pattern : 
  - Collections.sort() method and the Comparator interface
  -Collections.sort() method and the Comparator interface, which is a strategy interface and defines a strategy for comparing objects. Because of this pattern, we don't need to       modify the sort() method (closed for modification) to compare any object; at the same time, we can implement a Comparator interface to define a new comparing strategy (open       for extension).This pattern is actually based upon the open-closed design principle
  
  
## Flyweight Design pattern : Example is String 
     




## Creational Design Patterns : 
  - 1. Abstract factory :: Abstract Factory provides interfaces for creating families of related or dependent objects without specifying their concrete classes.
        ex . XML API implements abstract factory. There is a class name SchemaFactory. 
  
  - 2. Builder :: Lets you construct complex objects step by step. The pattern allows you to produce different types
                  and representations of an object using the same construction code.
