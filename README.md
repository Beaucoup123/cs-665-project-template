
| CS-665       | Software Design & Patterns |
|--------------|------------|
| Name         | XINXIAN WANG |
| Date         | 02/03/1998 |
| Course       | Spring     |
| Assignment 2 |            |

# Assignment Overview
- The job objective is to develop a notification system that notifies drivers of delivery requests. Upon receipt of a product delivery order from the store, a delivery request must be generated and sent to all available drivers.
# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future. 
<br>**Sol.** 
<br>The requirement of this task is to develop a notification system that would send delivery notifications from the system to the drivers. I designed two interfaces, Observer for updating delivery requests and Subject for registering, removing, and notifying drivers. The implementation is designed to be flexible so that new object types can be added or removed in the future. For example, if we need to add a new observer or subject, we can do so by implementing the observer and subject interfaces separately. Likewise, if we need to add a new request type, we can simply call the setOrder() method.
<br>  <br>
- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.
<br>**Sol.**
<br>The code is designed to be simple and easy to understand, with clear, easy-to-understand variable names and comments. Duplicate code is avoided by decomposing common functionality into reusable components, such as observer and body interfaces, which are implemented by different concrete classes as needed.
<br>  <br>
- Describe how you have avoided duplicated code and why it is important.
<br>**Sol.**
<br>In this implementation, we facilitate code reuse by implementing the observer and body interfaces, thus avoiding duplicate code. The observer interface defines the update () method for notifying observers of changes to the subject, while the subject interface defines the registerObserver(), removeObserver(), and notifyObserver() methods for managing the list of observers and notifying them of changes. By implementing these interfaces, we can reuse the same code for multiple observers and subjects. For example, the store class implements the subject interface and maintains a list of observers, which can include any object that implements the observer interface.
<br>  <br>
- If applicable, mention any design patterns you have used and explain why they were chosen.
<br>**Sol.**
<br>My implementation uses the Observer pattern in the design pattern. By using the Observer pattern, we can easily add or remove observers without affecting the rest of the system. The Shop maintains a list of registered observers and notifies them of new orders or other events by calling their update () method. the Driver class is an example of an observer that can be registered to the Shop to receive notifications of new orders.

# Compile and execute
- Codes are in the folder of src/main/java/edu.bu.met.cs665/Assignment2. Junit codes are in the fold of src/test/java/edu.bu.met.cs665/Assignment2. And the application contains two strategy interfaces: Interface Subject and Interface Observer. The implementation class of Subject is class Shop. The implementation class of Observer is class Driver. In addition, Main Class is used to start the program and test my solution by creating an instance of Shop, a Delivery Request, and a minimum of 5 Driver objects. During testing, broadcast a single Delivery Request and send notifications to all Drivers regarding the delivery.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




