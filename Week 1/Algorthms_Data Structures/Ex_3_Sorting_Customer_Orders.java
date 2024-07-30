/*Scenario: 
You are tasked with sorting customer orders by their total price on an e-commerce platform. This helps in prioritizing high-value orders.
Steps:
1.	Understand Sorting Algorithms:
o	Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).
2.	Setup:
o	Create a class Order with attributes like orderId, customerName, and totalPrice.
3.	Implementation:
o	Implement Bubble Sort to sort orders by totalPrice.
o	Implement Quick Sort to sort orders by totalPrice.
4.	Analysis:
o	Compare the performance (time complexity) of Bubble Sort and Quick Sort.
o	Discuss why Quick Sort is generally preferred over Bubble Sort.
 */
public class Ex_3_Sorting_Customer_Orders {

    // Bubble Sort
    public static void bubbleSort(Ex_3_Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Ex_3_Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Ex_3_Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Ex_3_Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                Ex_3_Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Ex_3_Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Ex_3_Order[] orders = {
            new Ex_3_Order(1, "Karan", 250.50),
            new Ex_3_Order(2, "Shubhangi", 150.75),
            new Ex_3_Order(3, "Priya", 300.00),
            new Ex_3_Order(4, "Khushi", 100.25),
            new Ex_3_Order(5, "Jahnvi", 200.00)
        };

        System.out.println("Original Orders:");
        for (Ex_3_Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        for (Ex_3_Order order : orders) {
            System.out.println(order);
        }


        orders = new Ex_3_Order[]{
            new Ex_3_Order(1, "Karan", 250.50),
            new Ex_3_Order(2, "Shubhangi", 150.75),
            new Ex_3_Order(3, "Priya", 300.00),
            new Ex_3_Order(4, "Khushi", 100.25),
            new Ex_3_Order(5, "Jahnvi", 200.00)
        };

        // Quick Sort
        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Ex_3_Order order : orders) {
            System.out.println(order);
        }
    }
}
