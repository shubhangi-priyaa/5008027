//3. Define Service Class
public class Ex_11_CustomerService {
    private Ex_11_CustomerRepository customerRepository;

    // Constructor Injection
    public Ex_11_CustomerService(Ex_11_CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(String id) {
        return customerRepository.findCustomerById(id);
    }
}
