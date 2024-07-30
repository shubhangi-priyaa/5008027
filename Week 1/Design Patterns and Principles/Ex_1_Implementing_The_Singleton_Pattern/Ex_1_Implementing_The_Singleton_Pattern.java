/*
Scenario: 
You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.
Steps:
1.	Create a New Java Project:
o	Create a new Java project named SingletonPatternExample.
2.	Define a Singleton Class:
o	Create a class named Logger that has a private static instance of itself.
o	Ensure the constructor of Logger is private.
o	Provide a public static method to get the instance of the Logger class.
3.	Implement the Singleton Pattern:
o	Write code to ensure that the Logger class follows the Singleton design pattern.
4.	Test the Singleton Implementation:
o	Create a test class to verify that only one instance of Logger is created and used across the application.

 */
public class Ex_1_Implementing_The_Singleton_Pattern {

    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test to see if both references point to the same instance
        System.out.println("Logger1 hashcode: " + logger1.hashCode());
        System.out.println("Logger2 hashcode: " + logger2.hashCode());

        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");

        // Confirm that both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}
