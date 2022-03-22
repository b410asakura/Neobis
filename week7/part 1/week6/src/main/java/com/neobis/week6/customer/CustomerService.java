package com.neobis.week6.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long customerId) {
        boolean exists = customerRepository.existsById(customerId);
        if (!exists) throw
                new IllegalStateException("There is no customer with id = " + customerId);
        return customerRepository.findById(customerId);
    }

    public Customer addNewCustomer(Customer customer) {
        Optional<Customer> customerFirstName =
                customerRepository.findCustomerByFirstName(customer.getFirstName());
        Optional<Customer> customerLastName =
                customerRepository.findCustomerByLastName(customer.getLastName());
        if (customerFirstName.isPresent()
                && customerLastName.isPresent())
            throw new IllegalStateException("Customer is already exists");
        return customerRepository.save(customer);
    }


    public void deleteCustomer(Long customerId) {
        boolean exists = customerRepository.existsById(customerId);
        if (!exists) throw
                new IllegalStateException("There is no customer with id = " + customerId);
        customerRepository.deleteById(customerId);
    }

    public Customer updateCustomer(Customer newCustomer) {
         Customer customer = customerRepository.findById(newCustomer.getCustomerId())
                .orElseThrow(() -> new IllegalStateException(
                                "Customer with id = " + newCustomer.getCustomerId() + " doesn't exists"
                        )
                );
         customer.setFirstName(newCustomer.getFirstName());
         customer.setLastName(newCustomer.getLastName());
         customer.setPhoneNumber(newCustomer.getPhoneNumber());
         customer.setEmail(newCustomer.getEmail());
         customer.setCity(newCustomer.getCity());
         customer.setCountry(newCustomer.getCountry());
         return customerRepository.save(customer);
    }
}
