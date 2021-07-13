package io.ksrntheja.employee.management.system.ws.service;

import io.ksrntheja.employee.management.system.ws.controller.model.Employee;
import io.ksrntheja.employee.management.system.ws.repository.EmployeeManagementSystemRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagementSystemServiceImpl implements EmployeeManagementSystemService {

    private EmployeeManagementSystemRepository employeeManagementSystemRepository;

    EmployeeManagementSystemServiceImpl(EmployeeManagementSystemRepository employeeManagementSystemRepository) {
        this.employeeManagementSystemRepository = employeeManagementSystemRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeManagementSystemRepository.getAllEmployeesRepositoryEntries();
    }

}
