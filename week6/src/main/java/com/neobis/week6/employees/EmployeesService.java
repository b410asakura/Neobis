package com.neobis.week6.employees;


import com.neobis.week6.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    private final EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    public Optional<Employees> getEmployee(Long employeeId) {
        boolean exists = employeesRepository.existsById(employeeId);
        if (!exists) throw
                new IllegalStateException("There is no employee with id = " + employeeId);
        return employeesRepository.findById(employeeId);
    }

    public void addNewEmployee(Employees employees) {
//        Optional<Employees> employeeFirstName =
//                employeesRepository.findEmployeesByFirstName(employees.getFirstName());
//        Optional<Employees> employeeLastName =
//                employeesRepository.findEmployeesByLastName(employees.getLastName());
//        if (employeeFirstName.isPresent()
//                && employeeLastName.isPresent())
//            throw new IllegalStateException("Customer is already exists");
        employeesRepository.save(employees);
    }

    public void deleteEmployee(Long employeeId) {
        boolean exists = employeesRepository.existsById(employeeId);
        if (!exists) throw
                new IllegalStateException("There is no employee with id = " + employeeId);
        employeesRepository.deleteById(employeeId);
    }

    public void updateEmployee(Employees newEmployees) {
        Employees employees = employeesRepository.findById(newEmployees.getEmployeeId())
                .orElseThrow(() -> new IllegalStateException(
                                "Employee with id = " + newEmployees.getEmployeeId() + " doesn't exists"
                        )
                );
        employees.setFirstName(newEmployees.getFirstName());
        employees.setLastName(newEmployees.getLastName());
        employees.setSalary(newEmployees.getSalary());
        employees.setPositionId(newEmployees.getPositionId());
        employeesRepository.save(employees);
    }
}
