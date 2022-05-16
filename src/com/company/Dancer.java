package com.company;

public class Dancer extends Person{
    public Dancer(String name, int age) {
        super(name, age);
    }
    public Dancer () {

    }

    @Override
    void walk() {
        System.out.println("dancer");
    }
}
