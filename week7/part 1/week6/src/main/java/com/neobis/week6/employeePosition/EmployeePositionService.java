package com.neobis.week6.employeePosition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePositionService {

    private final EmployeePositionRepository employeePositionRepository;

    @Autowired
    public EmployeePositionService(EmployeePositionRepository employeePositionRepository) {
        this.employeePositionRepository = employeePositionRepository;
    }

    public List<EmployeePosition> getEmployeePositions() {
        return employeePositionRepository.findAll();
    }

    public Optional<EmployeePosition> getEmployeePositionsById(Long positionId) {
        return employeePositionRepository.findById(positionId);
    }

    public EmployeePosition addEmployeePosition(EmployeePosition employeePosition) {
        return employeePositionRepository.save(employeePosition);
    }

    public EmployeePosition updateEmployeePosition(EmployeePosition newEmployeePosition) {
        EmployeePosition employeePosition = employeePositionRepository
                .findById(newEmployeePosition.getPositionId())
                .orElseThrow(()-> new IllegalStateException("There is no employee position with id = "
                        + newEmployeePosition.getPositionId()));
        employeePosition.setName(newEmployeePosition.getName());
        return employeePositionRepository.save(employeePosition);
    }

    public void deleteEmployeePosition(Long positionId) {
        employeePositionRepository.deleteById(positionId);
    }
}
