package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов " +
//                "перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getNameSurname();
//        name = "Mr. " + name;
//        firstStudent.setNameSurname(name);
//
//        firstStudent.setAverageGrade(firstStudent.getAverageGrade() + 0.2);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов " +
//                "после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice логируем нормальное окончание работы метода " +
                "или выброс исключения");
    }
}
