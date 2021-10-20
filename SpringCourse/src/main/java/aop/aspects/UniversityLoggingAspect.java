package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение списка студентов " +
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
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение списка студентов " +
//                "после работы метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логгируем выброс исключения " + exception);
    }
}
