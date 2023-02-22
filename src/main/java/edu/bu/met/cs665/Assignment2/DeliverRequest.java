package edu.bu.met.cs665.Assignment2;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: DeliverRequest.java
 * Description: This class represents a delivery request,
 * which includes the destination, time, and items to be delivered.
 */
public class DeliverRequest {
  private String destination;
  private String time;
  private String[] items;

  /**
   * Constructor for the DeliverRequest class.
   * @param destination the destination of the delivery
   * @param time the time at which the delivery should take place
   * @param items an array of items to be delivered
   */
  public  DeliverRequest(String destination, String time, String[] items) {
    this.destination = destination;
    this.time = time;
    this.items = items;
  }

  /**
   * Getter method for the destination field.
   * @return the destination of the delivery
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Getter method for the time field.
   * @return the time at which the delivery should take place
   */
  public String getTime() {
    return time;
  }

  /**
   * Getter method for the items field.
   * @return an array of items to be delivered
   */
  public String[] getItems() {
    return items;
  }

}
