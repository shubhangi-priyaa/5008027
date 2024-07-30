//2. Implement Concrete Repository
public class Ex_11_CustomerRepositoryImpl implements Ex_11_CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // In a real application, this would interact with a database
        return "Customer with ID: " + id;
    }
}
