//4. Test the Dependency Injection Implementation
public class Ex_11_TestDI {

    public static void main(String[] args) {
        // Create a concrete repository instance
        Ex_11_CustomerRepository customerRepository = new Ex_11_CustomerRepositoryImpl();

        // Inject the repository into the service
        Ex_11_CustomerService customerService = new Ex_11_CustomerService(customerRepository);

        // Use the service to get customer details
        String customerDetails = customerService.getCustomerDetails("12345");
        System.out.println(customerDetails);
    }
}