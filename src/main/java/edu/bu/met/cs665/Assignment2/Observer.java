package edu.bu.met.cs665.Assignment2;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: Observer.java
 * Description: This interface represents an observer of driver,
 * which can receive and process updates from the subject.
 */
public interface Observer {

  /**
   * Update method for the observer. This method is called by the subject to
   * notify the observer of a change in state.
   * @param deliverRequest the delivery request that triggered the update
   */
  public void update(DeliverRequest deliverRequest);

}
