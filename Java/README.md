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
  > Java compiler or Java virtual machine looks for main() method when we execute the program
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
  
