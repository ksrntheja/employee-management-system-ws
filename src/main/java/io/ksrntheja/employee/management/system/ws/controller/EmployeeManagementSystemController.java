package io.ksrntheja.employee.management.system.ws.controller;

import io.ksrntheja.employee.management.system.ws.controller.model.Employee;
import io.ksrntheja.employee.management.system.ws.service.EmployeeManagementSystemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeManagementSystemController {

    private EmployeeManagementSystemService employeeManagementSystemService;

    EmployeeManagementSystemController(EmployeeManagementSystemService employeeManagementSystemService) {
        this.employeeManagementSystemService = employeeManagementSystemService;
    }

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeManagementSystemService.getAllEmployees();
    }

}
