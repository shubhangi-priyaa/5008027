public class Ex_2_Product {
    
        private int productId;
        private String productName;
        private String category;
    
        public Ex_2_Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    
        // Getters and Setters
        public int getProductId() {
            return productId;
        }
    
        public void setProductId(int productId) {
            this.productId = productId;
        }
    
        public String getProductName() {
            return productName;
        }
    
        public void setProductName(String productName) {
            this.productName = productName;
        }
    
        public String getCategory() {
            return category;
        }
    
        public void setCategory(String category) {
            this.category = category;
        }
    
    
}
