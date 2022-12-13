# Introduction to java
  
 > Java is a object oriented Programming Language used to develop mobile, web, desktop applications, games and much more.
 > It is a platform independent language.
 > It is open source, free, fast, secure and can reuse the code.

# Basic Syntax
 
 > Every Java code must me inside a class.
 
 ### Main.java
 
  ```
  public class Main {
   public static void main(String[] args) {
    System.out.println("Hello World");
   }
  }
  ```
  > In Java, class name should match with the file name and it should be in upper case letter.
  > The entry point of java programs is **main()** method and it is place where program starts its execution.
  > Java compiler or Java virtual machine looks for main() method when we execute the program.
  > public is an Access modiflier and static is non access modifier ,you dont have to create an object to access static methods,You can 
    directly access them and void is a keyword and it specifies method is not returning any value.
  > String[] args  -It stores command line arguments
    Ex:javac Main.java
    // java Main 1 2 3
  > System is a built-in class and that contains output to display and println() method to print on the screen.

## Access Modifier
  
  >Access modilfiers are used to set access level to classes, attributes, methods and constructors.
  
  ### Modilfiers are of  2 types
  - Access Modifiers      ->Controls the access level.
  - Non Access Modifiers  ->Do not control the access level,but provides other functionality.

  #### Access Modifiers
  - **Private** ->It is accessible only within the class.
  - **Public**  ->It is accessible within the class, outside the class, within the package, outside the page, basically everywhere.
  - **Protected** ->It is accessible within the package and also outside of the package  only through child class.
  - **Default** ->It is accessible within the package.
  
  #### Non Access Modifiers
  ->For classes,you can use either final or abstract.
  - **Final** ->It cannot be inherited by other classes.
  - **Abstract** ->It cannot be used to create objects.To access an abstract class, it must be inherited from another class.
  
  ->For attributes and methods,
  - **Final** ->	Attributes and methods cannot be overridden/modified.
  - **Abstract** ->Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();.      and the body is provided by the subclass (inherited from). 
  - **Static** ->Attributes and methods belongs to the class, rather than an object.

### Comments 
 - Single line ->   //
 - Multi line  -> /**/

### Variables
- variables are containers for storing values.
- **String** - stores text, such as "Hello". String values are surrounded by double quotes
- **int** - stores integers (whole numbers), without decimals, such as 123 or -123
- **float** - stores floating point numbers, with decimals, such as 19.99 or -19.99
- **char** - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- **boolean** - stores values with two states: true or false

### Data types
- **Primitive data types** - includes byte, short, int, long, float, double, boolean and charand it specifies the size and type of variable values
- **Non-primitive data types** - such as String, Arrays, Interfaces and Classes.They are called reference types because they refer to objects.
- A primitive type has always a value, while non-primitive types can be null.

### Type casting
 **Widening Casting (automatically)** - converting a smaller type to a larger type size.
 - byte -> short -> char -> int -> long -> float -> double
 
 ```
  int myInt = 9;
  double myDouble = myInt;
  ```

**Narrowing Casting (manually)** - converting a larger type to a smaller size type.
- double -> float -> long -> int -> char -> short -> byte

```
 double myDouble = 9.78d;
 int myInt = (int) myDouble;
 ```
 
 ### if-else
 
 ```
 if(condition){
 ....
 ....
 }
 else if(condition){
 ...
 ...
 }
 else{
 ...
 ...
 }
 ```
 
 ### while
 
 ```
 while(condition){
 ...
 increment/decrement;
 }
```

 ### do while
 
 ```
 do{
 ...
 increment/decrement;
 }while(condition);
```
-Difference between while and do while is,do while runs the code block once before checking the condition.

### For loop

```
for(initialisation;condition;inc/dec){
...
}
```

### Break
- It is used to break out of the loop.

### Continue
- It is used to skip the current interation in the loop.

### Switch

```
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

### Arrays
- They are used to store multiple values of same data type.
- **eg**- int[] nums={1,2,3,5,4},int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

#### For each loop
```
for(Integer i:nums){
System.out.println(i);
}
```

### Parameters and Arguments

```
public static void add(int a,int b){   //Formal parameters/parameters
System.out.println(a+b);
}
add(2,4);    //Actual paramters/Arguments
```


### Method overloading

- Multiple methods can have same name but with different number,different type  of parameters and different return type.

```
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

### Class and Objects

- class is a template for objects, and an object is an instance of a class.
- When the individual objects are created, they inherit all the variables and  methods from the class.

### Object creation
-Specify the class name along with object name and use new operator and initialise the constructor.

```
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

### Constructor

- A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.


### Encapsulation

- It is process of hiding sensitive data from users.
- It is process of binding data and methods together.

**Ex** -

```
public Class Person{
private String name="sai";

public String getName(){
return name;
}
public void setName(String newName){
this.name=newName;
}
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

```

### Packages

- Package is used to group related classes.
- Two types-Built-in and user defined packages.

```
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package

package mypack;                            //creating a package
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```

### Inheritance(extends keyword)

- Inheritance is the process of inheriting features from one class to other class.
-  A class that inherits from another class can reuse the methods and fields of that class.

**Sub class(child)** - class that inherits the other class
**Super class(parent)**-  class whose features are inherited 


### Polymorphism

- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

```
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```


### Inner classes
 - It is possible to nest classes inside other classes.The purpose of nested classes is to group classes that belong together, which makes your code more        readable and maintainable.

```
class Outer{
int x=10;
class Inner{
int y=10;
}
}

class Main{
public static void main(String [] args){
Outer outObj=new Outer();
Outer.Inner inObj=outObj.new Inner();
}
}

```

### Abstraction

- Data abstraction is the process of hiding certain details and showing only essential information to the user.

- **Abstract class**: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- **Abstract method**: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
- An abstract class can have both abstract and regular methods:

```
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```


### Interfaces(implements)

- Another way to achieve abstraction in Java, is with interfaces.
- An interface is a completely "abstract class" that is used to group related methods with empty bodies
- On implementation of an interface, you must override all of its methods

```
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```










  
