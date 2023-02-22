package edu.bu.met.cs665.Assignment2;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: Main.java
 * Description: This class represents the main entry point of the program,
 * which demonstrates the use of the Observer design pattern for delivery requests.
 */
public class Main {

  /**
   * Main method of the program.
   * Creates objects of the Shop and Driver classes and registers the drivers as observers
   * of the shop Calls the setOrder method of the Shop class to create a delivery request.
   */
  public static void main(String[] args) {

    // Create an object of the Shop class
    Shop shop = new Shop();

    // Create objects of the Driver class to act as observers
    Driver driver = new Driver("Tom(Van)");
    Driver driver1 = new Driver("Tony(Van)");
    Driver driver2 = new Driver("Jack(Taxi)");
    Driver driver3 = new Driver("Ken(Taxi)");
    Driver driver4 = new Driver("Bob(Scooter)");


    // Register the drivers as observers of the shop
    shop.registerObserver(driver);
    shop.registerObserver(driver1);
    shop.registerObserver(driver2);
    shop.registerObserver(driver3);
    shop.registerObserver(driver4);

    System.out.println("Notify each registered observer to see the message");

    // Call the setOrder method of the Shop class to create a delivery request
    String[] items = {"Tomato", "beverage", "coffee"};
    shop.setOrder("sutherland rd", "2/2/2022",items);

  }

}
