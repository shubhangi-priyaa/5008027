/*Scenario: 
You are developing a system to create complex objects such as a Computer with multiple optional parts. Use the Builder Pattern to manage the construction process.
Steps:
1.	Create a New Java Project:
o	Create a new Java project named BuilderPatternExample.
2.	Define a Product Class:
o	Create a class Computer with attributes like CPU, RAM, Storage, etc.
3.	Implement the Builder Class:
o	Create a static nested Builder class inside Computer with methods to set each attribute.
o	Provide a build() method in the Builder class that returns an instance of Computer.
4.	Implement the Builder Pattern:
o	Ensure that the Computer class has a private constructor that takes the Builder as a parameter.
5.	Test the Builder Implementation:
o	Create a test class to demonstrate the creation of different configurations of Computer using the Builder pattern.
 */

public class Ex_3_Implementing_the_Builder_Pattern{
     public static void main(String[] args) {
   
    Ex_3_Computer basicComputer = new Ex_3_Computer.Builder()
            .setCPU("Intel Core i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

    // Computer with Graphics Card and WiFi
    Ex_3_Computer gamingComputer = new Ex_3_Computer.Builder()
            .setCPU("Intel Core i7")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .setGraphicsCard(true)
            .setWiFi(true)
            .build();

 
    System.out.println("Basic Computer Configuration: " + basicComputer);
    System.out.println("Gaming Computer Configuration: " + gamingComputer);
}
}