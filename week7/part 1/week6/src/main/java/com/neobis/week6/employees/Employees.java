package com.neobis.week6.employees;


import javax.persistence.*;

@Entity
@Table
public class Employees {

    @Id
    @SequenceGenerator(
            name = "employees_sequence",
            sequenceName = "employees_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employees_sequence"
    )

    private Long employeeId;
    private String firstName;
    private String lastName;
    private Integer salary;
    private Long positionId;

    public Employees() {
    }

    public Employees(Long employeeId, String firstName, String lastName, Integer salary, Long positionId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.positionId = positionId;
    }

    public Employees(String firstName, String lastName, Integer salary, Long positionId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.positionId = positionId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", positionId=" + positionId +
                '}';
    }
}
