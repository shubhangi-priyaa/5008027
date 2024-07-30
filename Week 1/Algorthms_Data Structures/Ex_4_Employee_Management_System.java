/*Scenario: 
You are developing an employee management system for a company. Efficiently managing employee records is crucial.
Steps:
1.	Understand Array Representation:
o	Explain how arrays are represented in memory and their advantages.
2.	Setup:
o	Create a class Employee with attributes like employeeId, name, position, and salary.
3.	Implementation:
o	Use an array to store employee records.
o	Implement methods to add, search, traverse, and delete employees in the array.
4.	Analysis:
o	Analyze the time complexity of each operation (add, search, traverse, delete).
o	Discuss the limitations of arrays and when to use them.

 */
public class Ex_4_Employee_Management_System {
    private Ex_4_Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Ex_4_Employee_Management_System() {
        employees = new Ex_4_Employee[INITIAL_CAPACITY];
        size = 0;
    }

    // Add an employee
    public void addEmployee(Ex_4_Employee employee) {
        if (size == employees.length) {
            expandCapacity();
        }
        employees[size++] = employee;
    }

    // Search for an employee by ID
    public Ex_4_Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by ID
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false; // Employee not found
    }

    // Expand array capacity
    private void expandCapacity() {
        Ex_4_Employee[] newArray = new Ex_4_Employee[employees.length * 2];
        System.arraycopy(employees, 0, newArray, 0, size);
        employees = newArray;
    }

    // Main method for testing
    public static void main(String[] args) {
        Ex_4_Employee_Management_System system = new Ex_4_Employee_Management_System();

        // Add employees
        system.addEmployee(new Ex_4_Employee(1, "Alice", "Manager", 75000));
        system.addEmployee(new Ex_4_Employee(2, "Bob", "Developer", 60000));
        system.addEmployee(new Ex_4_Employee(3, "Charlie", "Analyst", 50000));

        // Traverse employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Search for an employee
        Ex_4_Employee employee = system.searchEmployee(2);
        System.out.println("\nSearch Result:");
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        boolean deleted = system.deleteEmployee(2);
        System.out.println("\nDeletion Status: " + (deleted ? "Success" : "Failed"));

        // Traverse employees after deletion
        System.out.println("\nEmployees After Deletion:");
        system.traverseEmployees();
    }
}
