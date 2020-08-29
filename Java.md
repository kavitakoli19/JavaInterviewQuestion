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


