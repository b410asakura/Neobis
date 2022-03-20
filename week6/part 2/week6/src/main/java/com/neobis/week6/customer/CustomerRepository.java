package com.neobis.week6.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findCustomerByFirstName(String firstName);
    Optional<Customer> findCustomerByLastName(String LastName);
}
