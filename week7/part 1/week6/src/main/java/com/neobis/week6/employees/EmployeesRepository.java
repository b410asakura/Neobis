package com.neobis.week6.employees;

import com.neobis.week6.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    Optional<Employees> findEmployeesByFirstName(String firstName);
    Optional<Employees> findEmployeesByLastName(String LastName);
}
