package edu.bu.met.cs665.Assignment2;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: Driver.java
 * Description: This class represents a driver who can
 * receive a delivery request and update the status accordingly.
 */

public class Driver implements Observer {

  private String driverName;

  /**
   * Constructor for the Driver class.
   * @param driverName the name of the driver
   */
  public Driver(String driverName) {
    this.driverName = driverName;
  }

  /**
   * Implementation of the update method from the Observer interface.
   * Prints the details of the delivery request to the console.
   * @param deliverRequest the delivery request that was received
   */
  @Override
  public void update(DeliverRequest deliverRequest) {
    System.out.println("-----------------------------------------------------------------");
    System.out.println("***Driver " + driverName + " received an order:");
    System.out.println("***Destination: " + deliverRequest.getDestination());
    System.out.println("***Time: " + deliverRequest.getTime());
    System.out.println("***Items: " + String.join(", ", deliverRequest.getItems()));
  }
}
