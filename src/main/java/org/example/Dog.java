package org.example;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public void makeNoise(Animal animal) {
        System.out.println("Bark Bark");
    }
}
