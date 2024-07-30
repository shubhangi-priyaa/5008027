public class Ex_3_Order {

        private int orderId;
        private String customerName;
        private double totalPrice;
    
        public Ex_3_Order(int orderId, String customerName, double totalPrice) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalPrice = totalPrice;
        }
    
        // Getters
        public int getOrderId() {
            return orderId;
        }
    
        public String getCustomerName() {
            return customerName;
        }
    
        public double getTotalPrice() {
            return totalPrice;
        }
    
        @Override
        public String toString() {
            return "Order ID: " + orderId + ", Customer: " + customerName + ", Total Price: $" + totalPrice;
        }
    }
