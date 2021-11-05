package application.dao;

import application.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
