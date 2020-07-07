# CECS-277-LAB-8-Ordering-System
CECS 277
LAB ASSIGNMENT 8
Assigned date: 11/6
Due date: 12/2
30 points

1. Design a ordering system application using visitor pattern.

The customer can order the following items:

    laptop computers
    20% discount if the labtop is the Microsoft Surface
    Mobil phones
    Apple phone
    Apply $30 discount If the price is greater than $400.00
    Samsung phone
    Apply 20% discount if the phone is Galaxy S8
    Video game
    Sony-Playstation - 20% discount
    30% discount for buying two Microsoft Xbox One consoles.

Write a main method that accepts the customer orders, displays the orders and the total cost of all the orders.

Grading

Retun the following printouts:

    UML pattern diagram
    Coding for all the classes including the main method

2. Command pattern
//class Stock

public class Stock {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void buy(int quantity){
        System.out.println(“BOUGHT: “ + quantity + “x “ + this);
    }

    public void sell(int quantity){
        System.out.println(“SOLD: “ + quantity + “x “ + this);
    }

    public String toString() {
        return “Product [name=” + name + “, price=” + price + “]”;
    }

}

a. Create two command classes that allows the customer to buy and sold stocks.
b. Write a main method to test it.

Retun the following printouts:

    UML pattern diagram
    Coding for all the classes including the main method

3. Memento pattern

Design a simple calculator that allows to restores the previous additon operation of two numbers.

Retun the following printouts:

    UML pattern diagram
    Coding for all the classes including the main method
