// .........Single level Inheritance.............

// public class assignment {
// public void methodA (){
// System.out.println("Base class menthod");
// }
// }
// class B extends A{
// public void methodB(){
// System.out.println("Child class method");
// }
// public static void main(String args[]){
// B obj= new B();
// obj.methodA();
// obj.methodB();
// }
// private void methodA() {
// }
// }

// ............. MULTI LEVEL INHERITANCE ..............

// interface Event{
// public void start();
// }
// interface Sports{
// public void play();
// }
// interface Hockey extends Sports, Event{
// public void show();
// }
// public class assignment{
// public static void main(String[] args){
// Hockey hockey = new Hockey(){
// public void start(){
// System.out.println("Start Event");
// }
// public void play(){
// System.out.println("Play Sports.");
// }
// public void show(){
// System.out.println("Show Hockey.");
// }
// };
// hockey.start();
// hockey.play();
// hockey.show();
// }
// }

// ............Abstract class Program............

// abstract class Sunstar
// {
// abstract void printInfo();
// }
// class Employee extends Sunstar {
// void printInfo()
// {
// String name = "Sachin Yadav";
// int age = 22;
// float salary = 5000.50F;
// System.out.println(name);
// System.out.println(age);
// System.out.println(salary);
// }
// }
// class Base
// {
// public static void main(String args[])
// {
// Sunstar s = new Employee();
// s.printInfo();
// }
// }

// >>>>>>>>>>>WAP IMPLEMENT INTERFACE<<<<<<<<<<<

// interface college{
// void print();
// }
// class A6 implements college{
// public void print(){System.out.println("Hello Sachin Yadav");}
// public static void main(String args[]){
// A6 obj = new A6();
// obj.print();
// }
// }

// ..............WAP IMPLEMENT PROGRAM ON THIS..................

// class Student{
// int rollno;
// String name;
// float fee;
// Student(int rollno,String name,float fee){
// this.rollno=rollno;
// this.name=name;
// this.fee=fee;
// }
// void display(){System.out.println(rollno+" "+name+" "+fee);}
// }
// class TestThis2{
// public static void main(String args[]){
// Student s1=new Student(33,"Sachin Yadav",5000f);
// Student s2=new Student(03,"Aman Mishra",6000f);
// Student s3=new Student(39,"Prashant Mishra",4000f);
// Student s4=new Student(25,"Manisha Varshney",7000f);
// s1.display();
// s2.display();
// s3.display();
// s4.display();
// }}

// USE OF SUPER KEYWORD

// class Animal{
// String color="white";
// }
// class Dog extends Animal{
// String color="black";
// void printColor(){
// System.out.println(color);
// System.out.println(super.color);
// }
// }
// class TestSuper1{
// public static void main(String args[]){
// Dog d=new Dog();
// d.printColor();
// }}

// USE OF WRAPPPER CLASS

// public class assignment{
// public static void main(String args[]){
// Integer a=new Integer(3);
// int i=a.intValue();
// int j=a;
// System.out.println(a+" "+i+" "+j);
// }}

// WAP TO A CLASS STUDENT and ACCESS its data members using OBJECT

// class Student{
// int id;
// String name;
// }
// class TestStudent1{
// public static void main(String args[]){
// Student s1=new Student();
// System.out.println(s1.id);
// System.out.println(s1.name);
// }
// }

// WAP to a class studemt and access its data members using object

// public class Student{
// private String name;
// private int age;
// private String major;
// public Student(String name, int age, String major) {
// this.name = name;
// this.age = age;
// this.major = major;
// }
// public String getName() {
// return this.name;
// }
// public int getAge() {
// return this.age;
// }
// public String getMajor() {
// return this.major;
// }
// public static void main(String[] args) {
// Student s = new Student("Sachin", 22, "Computer Science");
// System.out.println("Name: " + s.getName());
// System.out.println("Age: " + s.getAge());
// System.out.println("Major: " + s.getMajor());
// }
// }

// Wap to implement a class phone and access its data members using object

// public class Phone {
// private String brand;
// private String model;
// private int storageCapacity;
// public Phone(String brand, String model, int storageCapacity) {
// this.brand = brand;
// this.model = model;
// this.storageCapacity = storageCapacity;
// }
// public String getBrand() {
// return this.brand;
// }
// public String getModel() {
// return this.model;
// }
// public int getStorageCapacity() {
// return this.storageCapacity;
// } public static void main(String[] args) {
// Phone p = new Phone("Apple", "iPhone 13", 128);
// System.out.println("Brand: " + p.getBrand());
// System.out.println("Model: " + p.getModel());
// System.out.println("Storage Capacity: " + p.getStorageCapacity() + "GB");
// }
// }

// Wap to implement a class faculty with a default constructor that will
// initialize their data members value

// public class Faculty {
// private String name;
// private String department;
// private int yearsOfExperience;
// public Faculty() {
// this.name = "Unknown";
// this.department = "Unknown";
// this.yearsOfExperience = 0;
// }
// public String getName() {
// return this.name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public String getDepartment() {
// return this.department;
// }
// public void setDepartment(String department) {
// this.department = department;
// }
// public int getYearsOfExperience() {
// return this.yearsOfExperience;
// }
// public void setYearsOfExperience(int yearsOfExperience) {
// this.yearsOfExperience = yearsOfExperience;
// }
// public static void main(String[] args) {
// Faculty f = new Faculty();
// System.out.println("Name: " + f.getName());
// System.out.println("Department: " + f.getDepartment());
// System.out.println("Years of Experience: " + f.getYearsOfExperience());
// f.setName("Dr.Ankur Rai");
// f.setDepartment("Computer Science");
// f.setYearsOfExperience(5);
// System.out.println("Name: " + f.getName());
// System.out.println("Department: " + f.getDepartment());
// System.out.println("Years of Experience: " + f.getYearsOfExperience());
// }
// }

// Wap to implement a hierarchical inheritance using class and objects

// class Vehicle {
// private String type;
// private int numWheels;
// public Vehicle(String type, int numWheels) {
// this.type = type;
// this.numWheels = numWheels;
// }
// public String getType() {
// return this.type;
// }
// public int getNumWheels() {
// return this.numWheels;
// }
// }
// class Car extends Vehicle {
// private String make;
// public Car(String type, int numWheels, String make) {
// super(type, numWheels);
// this.make = make;
// }
// public String getMake() {
// return this.make;
// }
// }
// class Motorcycle extends Vehicle {
// private String brand;
// public Motorcycle(String type, int numWheels, String brand) {
// super(type, numWheels);
// this.brand = brand;
// }
// public String getBrand() {
// return this.brand;
// }
// public class Main {
// public static void main(String[] args) {
// Vehicle v = new Vehicle("Unknown", 0);
// Car c = new Car("Car", 4, "Toyota");
// Motorcycle m = new Motorcycle("Motorcycle", 2, "Honda");
// System.out.println("Vehicle Type: " + v.getType() + ", Number of Wheels: " +
// v.getNumWheels());
// System.out.println("Car Type: " + c.getType() + ", Number of Wheels: " +
// c.getNumWheels() + ", Make: " + c.getMake());
// System.out.println("Motorcycle Type: " + m.getType() + ", Number of Wheels: "
// + m.getNumWheels() + ", Brand: " + m.getBrand());
// }

// }

// }

// Wap to implemnt a class shape with default and parametarized constructor to
// show constructor overloading

// class Shape {
// private String name;
// private int sides;
// public Shape() {
// this.name = "Unknown";
// this.sides = 0;
// }
// public Shape(String name, int sides) {
// this.name = name;
// this.sides = sides;
// }
// public String getName() {
// return this.name;
// }
// public int getSides() {
// return this.sides;
// }
// }
// public class Main {
// public static void main(String[] args) {
// Shape s1 = new Shape();
// Shape s2 = new Shape("Triangle", 3);
// System.out.println("Shape 1 Name: " + s1.getName() + ", Number of Sides: " +
// s1.getSides());
// System.out.println("Shape 2 Name: " + s2.getName() + ", Number of Sides: " +
// s2.getSides());
// }
// }

// Wap to implement hybrid inheritance

// class A {
// public void printMessage() {
// System.out.println("Hello from Ritik");
// }
// }
// class B {
// public void printMessage() {
// System.out.println("Hello from Aman");
// }
// }
// class C extends A {
// public void printMessage() {
// System.out.println("Hello from Sachin Yadav");
// }
// }
// class D extends C {
// }
// public class Main {
// public static void main(String[] args) {
// D d = new D();
// d.printMessage();
// }
// }

// Wap to implemnt the concept of static data and functions using class and
// object

// class Person {
// private String name;
// private int age;
// private static int numberOfPeople = 0;
// public Person(String name, int age) {
// this.name = name;
// this.age = age;
// numberOfPeople++;
// }
// public static void printNumberOfPeople() {
// System.out.println("Number of people: " + numberOfPeople);
// }
// public String getName() {
// return this.name;
// }
// public int getAge() {
// return this.age;
// }
// }
// public class Main {
// public static void main(String[] args) {
// Person p1 = new Person("Sachin Yadav", 22);
// Person p2 = new Person("Aman Mishra", 22);
// Person p3 = new Person("Prashant Mishra", 24);
// System.out.println("Person 1 Name: " + p1.getName() + ", Age: " +
// p1.getAge());
// System.out.println("Person 2 Name: " + p2.getName() + ", Age: " +
// p2.getAge());
// System.out.println("Person 3 Name: " + p3.getName() + ", Age: " +
// p3.getAge());
// Person.printNumberOfPeople();
// }
// }

// Wap to implement polymorphism defining multiple same name functions within a
// class

// class Calculator {
// public int add(int x, int y) {
// return x + y;
// }
// public int add(int x, int y, int z) {
// return x + y + z;
// }
// public double add(double x, double y) {
// return x + y;
// }
// }
// public class Faculty {
// public static void main(String[] args) {
// Calculator calculator = new Calculator();
// int sum1 = calculator.add(2, 3);
// System.out.println("Sum of 2 and 3 is: " + sum1);
// int sum2 = calculator.add(2, 3, 4);
// System.out.println("Sum of 2, 3, and 4 is: " + sum2);
// double sum3 = calculator.add(2.5, 3.5);
// System.out.println("Sum of 2.5 and 3.5 is: " + sum3);
// }
// }

// Wap to implemented nested class and call function defined within inner class

// public class assignment {
// private int outerVariable = 10;
// public class InnerClass {
// public void innerMethod() {
// System.out.println("Inner method called");
// System.out.println("Outer variable value: " + outerVariable);
// }
// }
// public void outerMethod() {
// System.out.println("Outer method called");
// InnerClass inner = new InnerClass();
// inner.innerMethod();
// }
// public static void main(String[] args) {
// assignment outer = new assignment();
// outer.outerMethod();
// }
// }

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
}