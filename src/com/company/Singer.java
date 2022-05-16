package com.company;

public class Singer extends Person{
    public Singer(String name, int age) {
        super(name, age);
    }
    public Singer () {

    }

    @Override
    void walk() {
        System.out.println("cry");
    }
}
