package OOPsProgramming;

import java.util.*;
import java.util.Map.Entry;

//AllInOneOOPDemo.java
//Demonstrates all major OOP concepts in one program

//1️⃣ Inheritance
class Animal {
 String name;
 Animal(String name) {
     this.name = name;
 }
 void eat() {
     System.out.println(name + " is eating.");
 }
}

class Dog extends Animal { // Inheritance
 Dog(String name) {
     super(name);
 }

 // 2️⃣ Method Overriding
 @Override
 void eat() {
     System.out.println(name + " is eating dog food."); // overridden
 }

 // 3️⃣ Method Overloading
 void bark() {
     System.out.println(name + " is barking.");
 }

 void bark(int times) {
     System.out.println(name + " is barking " + times + " times."); // overloaded
 }
}

//4️⃣ Encapsulation
class Person {
 private String name;   // private variable
 private int age;

 public void setName(String name) { // setter
     this.name = name;
 }

 public void setAge(int age) { // setter
     this.age = age;
 }

 public String getName() { // getter
     return name;
 }

 public int getAge() {
     return age;
 }
}

//5️⃣ Interface
interface Printable {
 void print();
}

//6️⃣ Abstract class vs Interface
abstract class Shape {
 abstract void draw(); // must be implemented by subclass
}

class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a Circle (abstract class example).");
 }
}

//7️⃣ Multiple inheritance using Interface
interface Engine {
 void startEngine();
}

interface Fuel {
 void refuel();
}

class Car implements Engine, Fuel {
 public void startEngine() {
     System.out.println("Car engine started.");
 }

 public void refuel() {
     System.out.println("Car refueled.");
 }
}

//8️⃣ Singleton class
class Singleton {
 private static Singleton instance; // single instance

 // private constructor
 private Singleton() {}

 public static Singleton getInstance() {
     if (instance == null) {
         instance = new Singleton();
     }
     return instance;
 }

 public void showMessage() {
     System.out.println("Singleton instance invoked.");
 }
}

//Main class to demonstrate all
public class AllInOneOOPDemo {
 public static void main(String[] args) {

     System.out.println("1️⃣ Inheritance + 2️⃣ Method Overriding + 3️⃣ Method Overloading:");
     Dog dog = new Dog("Buddy");
     dog.eat();          // overridden
     dog.bark();         // method overloading
     dog.bark(3);
     System.out.println();

     System.out.println("4️⃣ Encapsulation:");
     Person person = new Person();
     person.setName("Alice");
     person.setAge(25);
     System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
     System.out.println();

     System.out.println("5️⃣ Interface:");
     Printable printable = () -> System.out.println("Printing using interface implementation.");
     printable.print();
     System.out.println();

     System.out.println("6️⃣ Abstract class vs Interface:");
     Circle circle = new Circle();
     circle.draw(); // abstract class example
     System.out.println();

     System.out.println("7️⃣ Multiple inheritance using Interface:");
     Car car = new Car();
     car.startEngine();
     car.refuel();
     System.out.println();

     System.out.println("8️⃣ Singleton class:");
     Singleton singleton1 = Singleton.getInstance();
     Singleton singleton2 = Singleton.getInstance();
     singleton1.showMessage();
     System.out.println("Are both singleton instances same? " + (singleton1 == singleton2));
 }
}
