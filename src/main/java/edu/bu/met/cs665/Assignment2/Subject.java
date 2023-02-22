package edu.bu.met.cs665.Assignment2;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: Subject.java
 * Description: This interface represents a subject of delivery requests,
 * which can register, remove, and notify observers of the updates.
 */
public interface Subject {
  /**
   * Register an observer with the subject.
   * @param o the observer to register
   */
  public void registerObserver(Observer o);

  /**
   * Remove an observer from the list of registered observers.
   * @param o the observer to remove
   */
  public void removeObserver(Observer o);

  /**
   * Notify all registered observers of a change in state.
   * @param deliverRequest the delivery request that triggered the notification
   */
  public void notifyObserver(DeliverRequest deliverRequest);
}
