package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddHandlingAdvice() {
        System.out.println("beforeGetHandlingAdvice: ловим и обрабатываем исключения при попытке получить книгу/журнал");
        System.out.println("-------------------------------");
    }

}
