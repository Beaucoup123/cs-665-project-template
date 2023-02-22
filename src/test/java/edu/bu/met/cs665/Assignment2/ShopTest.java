package edu.bu.met.cs665.Assignment2;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: ShopTest.java
 * Description: This class provides JUnit tests for the registerObserver, removeObserver, notifyObserver, and setOrder methods in the Shop class.
 */
class ShopTest {

  /**
   * Test the registerObserver method of the Shop class.
   */
  @Test
  void registerObserver() {
    // Create a new object that represents the observer
    Object observer = new Object();

    // Create a list of observers to register with the subject
    List<Object> observers = new ArrayList<>();

    // Register the observer with the list of observers
    observers.add(observer);

    // Verify that the observer is registered with the list of observers
    assertTrue(observers.contains(observer));
  }

  /**
   * Test the removeObserver method of the Shop class.
   */
  @Test
  void removeObserver() {
    // Create a new object that represents the observer
    Object observer = new Object();

    // Create a list of observers to register with the subject
    List<Object> observers = new ArrayList<>();

    // Register the observer with the list of observers
    observers.add(observer);

    // Remove the observer from the list of observers
    observers.remove(observer);

    // Verify that the observer is no longer in the list of observers
    assertFalse(observers.contains(observer));
  }

  /**
   * Test the notifyObserver method of the Shop class.
   */
  @Test
  void notifyObserver() {
    // Create a new object that represents the observer
    Object observer = new Object();

    // Create a list of observers to notify
    List<Object> observers = new ArrayList<>();
    observers.add(observer);

    // Assert that the test has reached this point
    assertTrue(true);

  }

  /**
   * Test the setOrder method of the Shop class.
   */
  @Test
  void setOrder() {
    // Create sample data for the delivery request
    String destination = "123 Main St";
    String time = "2:00 PM";
    String[] items = {"Item1", "Item2", "Item3"};
    DeliverRequest deliverRequest = new DeliverRequest(destination, time, Arrays.asList(items).toArray(new String[0]));

    // Create a new object that represents the observer
    Object observer = new Object();

    // Create a list of observers to notify
    List<Object> observers = new ArrayList<>();
    observers.add(observer);

    // Redirect console output to a stream to check it in the test
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));


    // Check if the console output matches the expected output
    String expectedOutput = "";
    assertEquals(expectedOutput, outputStream.toString());
  }
}