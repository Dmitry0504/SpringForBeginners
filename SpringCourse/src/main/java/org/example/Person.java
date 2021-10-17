package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

    public Person() {
        System.out.println("Empty constructor");
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
