https://docs.github.com/en/github/writing-on-github/basic-writing-and-formatting-syntax



### 1. Is Java completely OOP language?

### 3. Y is java called platform independant?

### 2. Can we override object class methods in an inteface?
	Yes we can. But only non final ones.

### 3. what are solid principles?

	**Single-responsibility Principle**
		- A class should have one and only one reason to change, meaning that a class should have only one job.

	**Open-closed Principle**
		- Objects or entities should be open for extension, but closed for modification.

	**Liskov substitution principle**
		- All this is stating is that every subclass/derived class should be substitutable for their base/parent class.


	**Interface segregation principle**
		- A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.


	**Dependency Inversion principle**
		- Entities must depend on abstractions not on concretions. 
		- It states that the high level module must not depend on the low level module, but they should depend on abstractions.

### 4. Why is lambda expression introduced in java 8?

### 5. Why is default method introduced in java 8?

### 6. What is generics in java? If it was introduced in java5 then how is the code backword compatible?
       Generics is a concept used for compiler only. It veryfies the type at compile time only.
       At run time it is treated as an object data type so it is backword compatible as there is no presence of generic classed while running the code.
       
### 7. How arrayList grows if it is created using consturcutor with size?

### How many data types are there in java?

	- 8
	- These primitive data types are: byte, short, int, long, float, double, boolean, and char.
	- The java.lang.String class represents character strings.

### What is the size of each data type in java?
	
	**Data Type**	**Size**	**Description**
	
	      byte	1 byte		Stores whole numbers from -128 to 127
	      short	2 bytes		Stores whole numbers from -32,768 to 32,767
	      int	4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
	      long	8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	      float	4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	      double	8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
	      boolean	1 bit		Stores true or false values
	      char	2 bytes		Stores a single character/letter or ASCII values



### Which is fastest sorting algo?
	Merge Sort 

### What are wrapper classes in java and why are they introduced?
All wrapper classes in java are immutable.

### Why we need immutable classes in java?
    1 reason could be to use as hashMap keys.

### is it required to have a HashMap key as an immutable class?
	we can keep a immutable class as a key for HasMap but it is not mandatory.
	Only thing is Mutable class should have cosnsidered its mutablity while designing HashCde and equals methods
	All Wrappers are immutable in java.
	
### Write hashcode and equals methods in java?

### What is the difference between for and forEach loop in java?
		**For Loop**						**ForEach**
 	- The for loop is a common repetition structure. 		- The foreach loop is a control structure for traversing items in an array or a collection.
	It helps to iterate through a statement or a set of
	statements in the program.
	
	- A for loop can be used to retrieve a particular set		- The foreach loop cannot be used to retrieve a particular set of elements
	of elements.
	
	-The for loop is used as a general purpose loop.                - The foreach loop is used for arrays and collections. 
 
### What is functional interface in java?
	- It is an interface that contains exactly one abstract method.
	- It can have any number of default or static methods along with object class mthods.
	- Java provides predefined functional interfaces to deal with functional programming.
	- Runnable,Comparable,ActionListener are some of the examples.

### 1. StringBuffer is implemented by using synchronized keyword on all methods.

### 2. Why do we need Wrapper Classes in Java?
A wrapper class wraps (encloses) around a data type and gives it an object appearance.
Reasons why we need Wrapper Classes
• null is a possible value
• use it in a Collection
• Methods that support Object like creation from other types.. like String
◦ Integer number2 = new Integer("55");//String


### 3. What are differences in the two ways of creating Wrapper Classes?
The difference is that using the Constructor you will always create a new object, while using valueOf()
static method, it may return you a cached value with-in a range.
For example : The cached values for long are between [-128 to 127].
We should prefer static valueOf method, because it may save you some memory. To understand it further,
here is an implementation of valueOf method in the Long class
```
public static Integer valueOf(int i) {
if (i >= IntegerCache.low && i <= IntegerCache.high )
return IntegerCache.cache [i + (-IntegerCache.low )];
16 Java Interview Questions and Answers – www.in28Minutes.com
return new Integer(i);
}
```


### 4. What is Auto Boxing?
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and
their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a
Double, and so on. If the conversion goes the other way, this is called unboxing.
Example 1
```
Integer nineC = 9;
Example 2
Integer ten = new Integer(10);
ten++;//allowed. Java does had work behind the screen for us
```

### 5. What are the advantages of Auto Boxing?
Auto Boxing helps in saving memory by reusing already created Wrapper objects. Auto Boxing uses the
static valueOf methods. However wrapper classes created using new are not reused.
Two wrapper objects created using new are not same object.

```
Integer nineA = new Integer(9);
Integer nineB = new Integer(9);
System.out.println(nineA == nineB);//false
System.out.println(nineA.equals(nineB));//true
```

Two wrapper objects created using boxing are same object.

```
Integer nineC = 9;
Integer nineD = 9;
System.out.println(nineC == nineD);//true
System.out.println(nineC.equals(nineD));//true
````

### 6. What is Casting?
Casting is used when we want to convert on data type to another.
There are two types of Casting
- Implicit Casting
- Explicit Casting

### 7. What is Implicit Casting?
Implicit Casting is done by the compiler. Good examples of implicit casting are all the automatic widening
conversions i.e. storing smaller values in larger variable types.
```
int value = 100;
long number = value; //Implicit Casting
float f = 100; //Implicit Casting
```

### 8.What is Explicit Casting?
Explicit Casting is done through code. Good examples of explicit casting are the narrowing conversions.
Storing larger values into smaller variable types;
```
long number1 = 25678;
int number2 = (int)number1;//Explicit Casting
//int x = 35.35;//COMPILER ERROR
int x = (int)35.35;//Explicit Casting
```
Explicit casting would cause truncation of value if the value stored is greater than the size of the variable.
```
int bigValue = 280;
byte small = (byte) bigValue;
System.out.println(small);//output 24. Only 8 bits remain.
```
### 9. What is Upcasting and Downcasting in java?

 - referred from :: https://www.geeksforgeeks.org/upcasting-vs-downcasting-in-java/?ref=leftbar-rightbar
 - Typecasting is one of the most important concepts which basically deals with the conversion of one data type to another datatype implicitly or explicitly.
 - Just like the datatypes, the objects can also be typecasted.
 - However, in objects, there are only two types of objects (i.e.) parent object and child object. 
 - Therefore, typecasting of objects basically mean that one type of object (i.e.) child or parent to another.
    - **Upcasting:** 
            Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. Upcasting gives us the flexibility to access the                           parent class members but it is not possible to access all the child class members using this feature. Instead of all the members, we can access some specified                   members of the child class. For instance, **we can access the overridden methods**.
    - **Downcasting:** 
            Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicitly.
            
            
``` 
//Parent class 
class Parent { 
	String name; 

	// A method which prints the 
	// signature of the parent class 
	void method() 
	{ 
		System.out.println("Method from Parent"); 
	} 
} 
```

```
// Child class 
class Child extends Parent { 
	int id; 

	// Overriding the parent method 
	// to print the signature of the 
	// child class 
	@Override
	void method() 
	{ 
		System.out.println("Method from Child"); 
	} 
} 
```
```
// Demo class to see the difference 
// between upcasting and downcasting 
public class GFG { 

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Upcasting 
		Parent p = new Child(); 
		p.name = "GeeksforGeeks"; 

		// This parameter is not accessible 
		// p.id = 1; 
		System.out.println(p.name); 
		p.method(); 

		// Trying to Downcasting Implicitly 
		// Child c = new Parent(); - > compile time error 

		// Downcasting Explicitly 
		Child c = (Child)p; 

		c.id = 1; 
		System.out.println(c.name); 
		System.out.println(c.id); 
		c.method(); 
	} 
} 

   ```
   
  ```
  Output:
  GeeksforGeeks
  Method from Child
  GeeksforGeeks
  1
  Method from Child
  ```
     

  
### 10.What are differences between String and StringBuffer?
- Objects of type String are immutable. StringBuffer is used to represent values that can be
modified.
- In situations where values are modified a number to times, StringBuffer yields significant
performance benefits.
- Both String and StringBuffer are thread-safe.
- StringBuffer is implemented by using synchronized keyword on all methods.


### 11. What are differences between StringBuilder and StringBuffer?
StringBuilder is not thread safe. So, it performs better in situations where thread safety is not required.

### 12. String are immutable in java

### 13. All wrapper types in java are immutable

### 14. How to create immutable class in java?

### 15. Where are string values stored in memory?

- Approach 1
In the example below we are directly referencing a String literal.
```
String str1 = "value";
```
This value will be stored in a "String constant pool" – which is inside the Heap memory. If compiler finds
a String literal,it checks if it exists in the pool. If it exists, it is reused.
```
String str5 = "value";
```
In above example, when str5 is created - the existing value from String Constant Pool is reused.

- Approach 2
However, if new operator is used to create string object, the new object is created on the heap. There
will not be any reuse of values.
```
//String Object - created on the heap
String str2 = new String("value");
```

### 16. Output of below snippet ?

#### Snippet 1: 

```
SampleCode s = new SampleCode();
s.method(1,1); //compile time error

void method(long a,int b) { }

void method(int a,long b) { )
}
	
```
#### Output
```
Compile Time Error : 

The method method1(int, long) is ambiguous for the type SampleCode

```

#### Snippet 2: 

```
SampleCode s = new SampleCode();
s.method1(1,1);
s.method2(1,1);

void method1(long a,int b) { 
	System.out.println("First long then int :: " + a+" "+b);
}

void method2(float a,int b) { 
	System.out.println("First float then int :: " + a+" "+b);
}

```
#### Output
```
First long then int 1 1

First float then int 1.0 1

```


### 17. Output of below snippet ?

#### Snippet 1 :: 
```
SampleCode s = new SampleCode();
s.method(NULL); // Compile time error

public void method(String string) {
	System.out.println("With String argument " + string);
}

public void method(Object object) {
	System.out.println("With Object parameter " + object);
}

```

#### Output
```
NULL cannot be resolved to a variable

```

#### Snippet 2 ::

```
SampleCode s = new SampleCode();
s.method(null);

public void method(String string) {
	System.out.println("With String argument " + string);
}

public void method(Object object) {
	System.out.println("With Object parameter " + object);
}

```

#### Output
```
Please note :: The reason behind this is java compiler tries to find out 
the method with most specific input parameters to invoke a method. 
We know that Object is the parent class of String, so the choice was easy

```

```
With String argument null

```


#### Snippet 3 ::

```
SampleCode s = new SampleCode();
s.method(null); //Compile time error

public void method(String string) {
	System.out.println("With String argument " + string);
}

public void method(Object object) {
	System.out.println("With Object parameter " + object);
}

public void method(Integer inte) {
	System.out.println("With Integer parameter " + inte);
}

```

#### Output

```
You will get compile time error as The method method(String) is ambiguous for the type SampleCode 
because both String and Integer class have Object as parent class and there is no inheritance.
So java compiler doesn’t consider any of them to be more specific, hence the method ambiguous call error.
```
```
The method method(String) is ambiguous for the type SampleCode

```


#### Snippet 4 ::

```
SampleCode s = new SampleCode();
s.method(null); //Compile time error

public void method(Number number) {
	System.out.println("With number argument " + number);
}

public void method(Object object) {
	System.out.println("With Object parameter " + object);
}

public void method(Integer inte) {
	System.out.println("With Integer parameter " + inte);
}

```

#### Output

```
As above explained, here method(Integer inte) is the most specific method because 
it’s inherited from Number class and hence this code compiles fine and 
when executed prints With Integer parameter
```
```
With Integer parameter null

```


### Snippet 5 :: 

```
package com.journaldev.strings;

public class Test {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(Exception e) {
		System.out.println("Exception");
	}

	public void foo(NullPointerException ne) {
		System.out.println("NullPointerException");
	}

	public static void main(String[] args) {
		new Test().foo(null);
	}

}

```
As above explained, here foo(NullPointerException ne) is the most specific method because 
it’s inherited from Exception class and hence this code compiles fine and when executed prints “NullPointerException”.
```
```
#### Output
```
NullPointerException

```

### 18. Shallow Clonning vs Deep Clonning

https://www.programmingmitra.com/2016/11/Java-Cloning-Types-of-Cloning-Shallow-Deep-in-Details-with-Example.html


### 19. Exception Handling with Method Overriding in Java

reference :: https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/

Following conclusions can be derived from the above examples:

- If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not the checked exceptions.
- If SuperClass declares an exception, then the SubClass can only declare the child exceptions of the exception declared by the SuperClass, but not any other exception.
- If SuperClass declares an exception, then the SubClass can declare without exception.

