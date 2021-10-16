package org.example;

import org.springframework.stereotype.Component;

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

    protected void init() {
        System.out.println("Class dog initialization");
    }

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
