package spring.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.spring_data_jpa.entity.Employee;

import java.util.List;

//                          указываем сущность с которой предстоит работать и тип primary key
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByName(String name);

}
