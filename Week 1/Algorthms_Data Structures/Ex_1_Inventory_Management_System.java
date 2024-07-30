/*Scenario: 
You are developing an inventory management system for a warehouse. Efficient data storage and retrieval are crucial.
Steps:
1.	Understand the Problem:
o	Explain why data structures and algorithms are essential in handling large inventories.
o	Discuss the types of data structures suitable for this problem.
2.	Setup:
o	Create a new project for the inventory management system.
3.	Implementation:
o	Define a class Product with attributes like productId, productName, quantity, and price.
o	Choose an appropriate data structure to store the products (e.g., ArrayList, HashMap).
o	Implement methods to add, update, and delete products from the inventory.
4.	Analysis:
o	Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.
o	Discuss how you can optimize these operations.
    
*/
import java.util.HashMap;
import java.util.Map;
public class Ex_1_Inventory_Management_System {

    private Map<Integer, Ex_1_Product> inventory;

    public void InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add a product
    public void addProduct(Ex_1_Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(Ex_1_Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    // Get a product
    public Ex_1_Product getProduct(int productId) {
        return inventory.get(productId);
    }
}