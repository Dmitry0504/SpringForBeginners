package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.entity.Employee;
import rest.exception_handling.EmployeeIncorrectData;
import rest.exception_handling.NoSuchEmployeeException;
import rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {

        List<Employee> employees = employeeService.getAllEmployees();

        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database");
        }

        return employee;
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException e) {

        EmployeeIncorrectData employeeIncorrectData = new EmployeeIncorrectData();
        employeeIncorrectData.setInfo(e.getMessage());

        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception e) {

        EmployeeIncorrectData employeeIncorrectData = new EmployeeIncorrectData();
        employeeIncorrectData.setInfo(e.getMessage());

        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.BAD_REQUEST);
    }

}
