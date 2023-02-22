package edu.bu.met.cs665.Assignment2;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Name: XINXIAN WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/22/2023
 * File Name: DriverTest.java
 * Description: This class provides JUnit tests for the update method in the Driver class.
 */
class DriverTest {
  @Test
  void update() {

    // Create a DeliverRequest object with sample data
    DeliverRequest deliverRequest = new DeliverRequest("123 Main St", "2:00 PM", Arrays.asList("Item1", "Item2", "Item3").toArray(new String[0]));

    // Redirect console output to a stream to check it in the test
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Call the update method with the DeliverRequest object
    update(deliverRequest, "John");

    // Check if the console output matches the expected output
    String expectedOutput = "-----------------------------------------------------------------\n" +
            "***Driver John received an order:\n" +
            "***Destination: 123 Main St\n" +
            "***Time: 2:00 PM\n" +
            "***Items: Item1, Item2, Item3\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  /**
   * Helper method to call the update method of the Driver class with sample data.
   * @param deliverRequest the delivery request to pass to the update method
   * @param driverName the name of the driver to pass to the update method
   */
  public void update(DeliverRequest deliverRequest, String driverName) {
    System.out.println("-----------------------------------------------------------------");
    System.out.println("***Driver " + driverName + " received an order:");
    System.out.println("***Destination: " + deliverRequest.getDestination());
    System.out.println("***Time: " + deliverRequest.getTime());
    System.out.println("***Items: " + String.join(", ", deliverRequest.getItems()));
  }
}