package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();

        Person person =  context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person);

        context.close();
    }
}
