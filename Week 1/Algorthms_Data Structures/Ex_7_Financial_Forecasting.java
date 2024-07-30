/*Scenario: 
You are developing a financial forecasting tool that predicts future values based on past data.
Steps:
1.	Understand Recursive Algorithms:
o	Explain the concept of recursion and how it can simplify certain problems.
2.	Setup:
o	Create a method to calculate the future value using a recursive approach.
3.	Implementation:
o	Implement a recursive algorithm to predict future values based on past growth rates.
4.	Analysis:
o	Discuss the time complexity of your recursive algorithm.
o	Explain how to optimize the recursive solution to avoid excessive computation.
 */
public class Ex_7_Financial_Forecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if years is 0, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: calculate the future value for one less year and apply the growth rate
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Main method for testing
    public static void main(String[] args) {
        double initialValue = 1000.0;  // Initial investment amount
        double growthRate = 0.05;      // Growth rate (5%)
        int years = 10;                // Number of years

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}
