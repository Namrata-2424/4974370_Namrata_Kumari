package Exercise11;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(String customerId) {
        return customerRepository.findCustomerById(customerId);
    }
}
