# Project tree
```
rock-paper-scissors/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── rockPaperScissors/
│   │   │   │   │   ├── Main.java
│   │   │   │   │   ├── Computer.java
│   │   │   │   │   ├── Human.java
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── mycompany/
│   │   │   │   │   ├── WinnerTest.java
├── target/
├── .gitignore
├── LICENSE
├── pom.xml
```

#

| |Abstract Class|Interface|
|:----|:----|:----|
|Definition|An abstract class is a class that cannot be instantiated and is meant to be extended by subclasses.|An interface is a collection of abstract methods and/or constants that can be implemented by a class.|
|Method Definition|Can provide complete, default or empty implementation of methods|Only provide method signatures.|
|Multiple Inheritance|Cannot extend multiple classes|Can extend multiple interfaces.|
|Accessibility|Can be abstract or concrete and can include private, protected or public methods and variables.|Only supports public accessibility of methods and constants.|
|Use Case|When classes need to share common functionality and behavior.|When a similar set of functionality is required for unrelated classes.|


<br>
In Java, an abstract class is a class that cannot be instantiated and is meant to be extended by subclasses, whereas an interface is a collection of abstract methods and/or constants that can be implemented by a class. While an abstract class can provide complete, default, or empty implementation of methods, an interface only provides method signatures.
<br>
Abstract classes can include private, protected, or public methods and variables and can be either abstract or concrete. On the other hand, interfaces only support public accessibility of methods and constants. In addition, a class can only extend one abstract class, but can implement multiple interfaces.

Abstract classes are typically used when classes need to share common functionality and behavior, while interfaces are useful when a similar set of functionality is required for unrelated classes.


```java
    public abstract class Animal {
        public abstract void makeSound();

        public void eat() {
            System.out.println("Animal is eating.");
        }
    }

    public interface Movable {
        public void move();
    }

```