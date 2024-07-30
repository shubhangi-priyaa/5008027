/*Scenario: 
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.
Steps:
1.	Understand Asymptotic Notation:
o	Explain Big O notation and how it helps in analyzing algorithms.
o	Describe the best, average, and worst-case scenarios for search operations.
2.	Setup:
o	Create a class Product with attributes for searching, such as productId, productName, and category.
3.	Implementation:
o	Implement linear search and binary search algorithms.
o	Store products in an array for linear search and a sorted array for binary search.
4.	Analysis:
o	Compare the time complexity of linear and binary search algorithms.
o	Discuss which algorithm is more suitable for your platform and why.
*/
import java.util.Arrays;

public class Ex_2_E_Commerce_Platform_Search_Function{

    public static Ex_2_Product linearSearch(Ex_2_Product[] products, int targetId) {
        for (Ex_2_Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null; 
    }

    // Binary Search Algorithm 
    public static Ex_2_Product binarySearch(Ex_2_Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == targetId) {
                return products[mid];
            }
            if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
    
  
    public static void main(String[] args) {
        // Create an array of products
        Ex_2_Product[] products = {
            new Ex_2_Product(5, "Product A", "Category 1"),
            new Ex_2_Product(3, "Product B", "Category 2"),
            new Ex_2_Product(1, "Product C", "Category 1"),
            new Ex_2_Product(4, "Product D", "Category 3"),
            new Ex_2_Product(2, "Product E", "Category 2")
        };

        // Linear search
        int targetIdLinear = 3;
        Ex_2_Product resultLinear = linearSearch(products, targetIdLinear);
        System.out.println("Linear Search Result:");
        if (resultLinear != null) {
            System.out.println(resultLinear);
        } else {
            System.out.println("Product not found.");
        }

        // Sort the array by productId for binary search
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        // Binary search
        int targetIdBinary = 4;
        Ex_2_Product resultBinary = binarySearch(products, targetIdBinary);
        System.out.println("\nBinary Search Result:");
        if (resultBinary != null) {
            System.out.println(resultBinary);
        } else {
            System.out.println("Product not found.");
        }
    }
}

