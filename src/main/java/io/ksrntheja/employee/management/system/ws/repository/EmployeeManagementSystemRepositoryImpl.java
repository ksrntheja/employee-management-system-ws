package io.ksrntheja.employee.management.system.ws.repository;

import io.ksrntheja.employee.management.system.ws.controller.model.Employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public class EmployeeManagementSystemRepositoryImpl implements EmployeeManagementSystemRepository {

    private JdbcTemplate jdbcTemplate;

    EmployeeManagementSystemRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getAllEmployeesRepositoryEntries() {
        List<Employee> allEmployees = null;
        try {
            allEmployees = jdbcTemplate.query(
                    "SELECT * FROM emp",
                    (resultSet, rowNumber) ->
                            new Employee(
                                    resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"),
                                    convertToLocalDate(resultSet.getDate("hiredate")), resultSet.getInt("sal"), resultSet.getInt("deptno"),
                                    resultSet.getInt("mgr"), resultSet.getInt("comm")
                            )
            );
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return allEmployees;
    }

    private LocalDate convertToLocalDate(Date hiredate) {
        return hiredate.toLocalDate();
    }

}
