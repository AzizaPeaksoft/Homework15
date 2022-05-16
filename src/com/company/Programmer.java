package com.company;

public class Programmer extends Person {
    public Programmer(String name, int age) {
        super(name, age);
    }
    public Programmer () {

    }

    @Override
    void walk() {
        System.out.println("coding");
    }
}
