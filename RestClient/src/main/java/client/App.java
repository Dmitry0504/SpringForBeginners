package client;

import client.configuration.MyConfig;
import client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = configApplicationContext.getBean("communication", Communication.class);

//        List<Employee> list = communication.getAllEmployees();
//        System.out.println(list);
//
//        System.out.println(communication.getEmployee(1));

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
//        employee.setId(8);

        communication.deleteEmployee(8);


    }
}
