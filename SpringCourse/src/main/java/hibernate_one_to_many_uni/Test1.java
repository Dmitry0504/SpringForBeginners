package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrey", "Sidorov", 1500);
//            Employee employee3 = new Employee("Anton", "Petrov", 1200);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
// ****************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 3);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//      **********************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//            *********************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 3);
//
//            session.delete(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
