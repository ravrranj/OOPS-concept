# OOPS-concept
Understanding the basic concepts of OOPS for Java (Object, functioon, program, instance variable , constructors )






When to Use this (instance variable) ?
✅ When a local variable (parameter) has the same name as an instance variable.
✅ When referring to instance variables explicitly inside the class.
✅ When using method chaining (return this;).


eg. class Pen {
    String color;  // Instance variable

    // Constructor with the same parameter name
    public Pen(String color) {
        this.color = color;  // ✅ Correct! Assigns parameter value to instance variable
    }

    public void printColor() {
        System.out.println(this.color); // Prints the actual color
    }
}

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Black");
        pen1.printColor();  // Output: Black ✅
    }
}

Also first part : Declares functions and variables.
Second part :  Creates an object, assigns values, and runs the function.



---------------------------------------------------------------------------------------------------------


What is a Constructor?
A constructor is a special method that is automatically called when an object is created.

It has the same name as the class.

It does not return anything (not even void).

It is used to initialize object properties (variables).

Default Constructor (Implicit)
If you don’t define a constructor, Java provides a default constructor that looks like this:

java
Copy
Edit
class Student {
    String name;
    int age;

    // Default Constructor (Automatically created by Java)
    public Student() {
        System.out.println("Student object created!");
    }
}
Now, when you write:

java
Copy
Edit
Student s1 = new Student();  // Constructor is called
The default constructor runs automatically.

Parameterized Constructor
If you want to initialize values while creating an object, you can use a constructor with parameters.

java
Copy
Edit
class Student {
    String name;
    int age;

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name; // Assign values
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        Student s1 = new Student("Shradha", 22); // Constructor is called with arguments
        s1.printInfo();  // Output: Shradha  22
    }
}
Here, the constructor initializes the values while creating the object.

So, to Answer Your Question:
✅ Student() is the constructor.
✅ new Student(); is calling the constructor and creating an object.
✅ Constructors run automatically when an object is created.


Yes! Constructors are a fundamental part of Object-Oriented Programming (OOPs) in Java. They are used for object initialization, which is one of the key principles of OOPs.

How Constructors Fit into OOPs Concepts
OOPs is based on four main principles:

Encapsulation → Wrapping data (variables) and methods together in a class.

Abstraction → Hiding complex details and exposing only essential features.

Inheritance → One class (child) can inherit properties from another class (parent).

Polymorphism → One action can behave differently based on the object.

Where Does Constructor Fit?
✅ Encapsulation → Constructors help initialize and control object data at the time of object creation.
✅ Inheritance → When a child class object is created, the parent class constructor is called first.
✅ Polymorphism → We can use constructor overloading (multiple constructors with different parameters).

Example of Constructor in OOPs
java
Copy
Edit
class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        Student s1 = new Student("Shradha", 22); // Constructor initializes values
        s1.printInfo();
    }
}
Here, the constructor is part of the OOPs principle of encapsulation.

Key Takeaways
✔ Constructors belong to the OOPs concept.
✔ They help initialize object properties.
✔ Every object creation calls a constructor.
✔ Encapsulation, Inheritance, and Polymorphism use constructors in different ways.

