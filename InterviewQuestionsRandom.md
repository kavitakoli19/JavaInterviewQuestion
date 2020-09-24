https://docs.github.com/en/github/writing-on-github/basic-writing-and-formatting-syntax

1. StringBuffer is implemented by using synchronized keyword on all methods.

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
    - #### Upcasting: 
            Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. Upcasting gives us the flexibility to access the                           parent class members but it is not possible to access all the child class members using this feature. Instead of all the members, we can access some specified                   members of the child class. For instance, **we can access the overridden methods**.
    - #### Downcasting: 
            Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicitly.
            
            
   ```
// Parent class 
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

### 14 How to create immutable class in java

### 15 Where are string values stored in memory?

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



