package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @PostConstruct
    protected void init() {
        System.out.println("Class dog initialization");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Class dog destroy");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Wow-Wow");
    }
}
