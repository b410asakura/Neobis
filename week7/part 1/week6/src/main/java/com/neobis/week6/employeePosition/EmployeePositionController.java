package com.neobis.week6.employeePosition;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employeePositions")
public class EmployeePositionController {

    private final EmployeePositionService employeePositionService;

    @Autowired
    public EmployeePositionController(EmployeePositionService employeePositionService) {
        this.employeePositionService = employeePositionService;
    }

    @GetMapping(path = "/getEmpemployeePositions")
    public List<EmployeePosition> getEmployeePositions(){
        return employeePositionService.getEmployeePositions();
    }

    @GetMapping(path = "/getEmpemployeePositions/{positionId}")
    public Optional<EmployeePosition> getEmployeePositionById(
            @PathVariable ("positionId") Long positionId
            ){
        return employeePositionService.getEmployeePositionsById(positionId);
    }

    @PostMapping(path = "/addNewEmployeePosition")
    public EmployeePosition addEmployeePosition(@RequestBody EmployeePosition employeePosition){
        return employeePositionService.addEmployeePosition(employeePosition);
    }

    @PutMapping(path = "/updateEmployeePosition/{positionId}")
    public EmployeePosition updateEmployeePosition(
            @PathVariable ("positionId") Long positionId,
            @RequestBody EmployeePosition newEmployeePosition
            ){
        return employeePositionService.updateEmployeePosition(newEmployeePosition);
    }

    @DeleteMapping(path = "/deleteEmployeePosition/{positionId}")
    public void deleteEmployeePosition(@PathVariable ("positionId") Long positionId){
        employeePositionService.deleteEmployeePosition(positionId);
    }
}
