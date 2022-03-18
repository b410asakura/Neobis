package com.neobis.week6.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeesController {

    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping(path = "/getEmployees")
    public List<Employees> getAllEmployees(){
        return employeesService.getAllEmployees();
    }

    @GetMapping(path = "getEmployees/{employeeId}")
    public Optional<Employees> getEmployee(@PathVariable("employeeId") Long employeeId){
        return employeesService.getEmployee(employeeId);
    }

    @PostMapping(path = "/addNewEmployee")
    public void addNewEmployee(@RequestBody Employees employees){
        employeesService.addNewEmployee(employees);
    }

    @DeleteMapping(path = "/deleteEmployees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeesService.deleteEmployee(employeeId);
    }

    @PutMapping(path = "/updateEmployee/{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long employeeId,
                                            @RequestBody Employees newEmployees){
        employeesService.updateEmployee(newEmployees);
    }
}
