package application.service;

import application.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
