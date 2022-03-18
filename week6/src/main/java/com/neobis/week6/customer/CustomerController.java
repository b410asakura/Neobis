package com.neobis.week6.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/getCustomers")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping(path = "/getCustomers/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable("customerId") Long customerId){
        return customerService.getCustomerById(customerId);
    }

    @PostMapping(path = "/addNewCustomer")
    public Customer addNewCustomer(@RequestBody Customer customer){
        return customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path = "/deleteCustomer/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId){
        customerService.deleteCustomer(customerId);
    }

    @PutMapping(path = "/updateCustomer/{customerId}")
    public void updateCustomer(@PathVariable("customerId") Long customerId,
                                            @RequestBody Customer newCustomer){
        customerService.updateCustomer(newCustomer);
    }

}
