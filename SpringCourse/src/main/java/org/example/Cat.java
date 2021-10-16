package org.example;

import org.springframework.stereotype.Component;

// если у анноьации компонент нет ("myCat") названия для бина
// то он создаст его автоматически, это будет имя класса с маленькой буквы
// если имя класса начинается с двух заглавных букв то id будет просто названием класса
// например SQLTest -> SQLTest
@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
