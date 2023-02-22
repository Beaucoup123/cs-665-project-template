package edu.bu.met.cs665.Assignment2;

import java.util.ArrayList;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: Shop.java
 * Description: This class represents a shop that can
 * receive delivery orders and notify the registered observers of the updates.
 */
public class Shop  implements Subject {
  private ArrayList<Observer> observers;

  /**
   * Constructor for the Shop class. Initializes the list of observers to an empty ArrayList.
   */
  public Shop() {
    observers = new ArrayList<Observer>();
  }

  /**
   * Register an observer with the subject.
   * @param o the observer to register
   */
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
   * Remove an observer from the list of registered observers.
   * @param o the observer to remove
   */
  @Override
  public void removeObserver(Observer o) {
    if (observers.contains(o)) {
      observers.remove(o);
    }
  }

  /**
   * Notify all registered observers of a change in state.
   * @param deliverRequest the delivery request that triggered the notification
   */
  @Override
  public void notifyObserver(DeliverRequest deliverRequest) {
    for (int i = 0; i < observers.size(); i++) {
      observers.get(i).update(deliverRequest);
    }
  }

  /**
   * Create a delivery request and notify registered observers of the request.
   * @param destination the destination of the delivery
   * @param time the time at which the delivery should take place
   * @param items an array of items to be delivered
   */
  public void setOrder(String destination, String time, String[] items) {
    DeliverRequest deliveryRequest = new DeliverRequest(destination, time, items);
    notifyObserver(deliveryRequest);
  }
}
