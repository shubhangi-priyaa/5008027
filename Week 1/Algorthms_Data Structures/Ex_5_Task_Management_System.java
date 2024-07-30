/*Scenario: 
You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.
Steps:
1.	Understand Linked Lists:
o	Explain the different types of linked lists (Singly Linked List, Doubly Linked List).
2.	Setup:
o	Create a class Task with attributes like taskId, taskName, and status.
3.	Implementation:
o	Implement a singly linked list to manage tasks.
o	Implement methods to add, search, traverse, and delete tasks in the linked list.
4.	Analysis:
o	Analyze the time complexity of each operation.
o	Discuss the advantages of linked lists over arrays for dynamic data.
 */
public class Ex_5_Task_Management_System {

    private Node head;

    private class Node {
        Ex_5_Task task;
        Node next;

        Node(Ex_5_Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Add a task to the end
    public void addTask(Ex_5_Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Ex_5_Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(int taskId) {
        if (head == null) return false;
        
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) return false; // Task not found

        current.next = current.next.next;
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        Ex_5_Task_Management_System manager = new Ex_5_Task_Management_System();
        
        // Add tasks
        manager.addTask(new Ex_5_Task(1, "Design Homepage", "In Progress"));
        manager.addTask(new Ex_5_Task(2, "Develop Backend", "Pending"));
        manager.addTask(new Ex_5_Task(3, "Write Documentation", "Completed"));
        
        // Traverse tasks
        System.out.println("All Tasks:");
        manager.traverseTasks();
        
        // Search for a task
        Ex_5_Task task = manager.searchTask(2);
        System.out.println("\nSearch Result:");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        boolean deleted = manager.deleteTask(2);
        System.out.println("\nDeletion Status: " + (deleted ? "Success" : "Failed"));

        // Traverse tasks after deletion
        System.out.println("\nTasks After Deletion:");
        manager.traverseTasks();
    }
}
