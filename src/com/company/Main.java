package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        Animal animal1 = new Animal();
        animal1.relax();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
                }
            if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            }
            if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
            if (animal.getClass().getName().equals("способности животных")) {
                assert animal instanceof Eagle;
                ((Eagle) animal).fly();
            }
        }
    }
}
