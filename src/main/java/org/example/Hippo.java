package org.example;

public class Hippo extends Animal{

    public Hippo(String name) {
        super(name);
    }
    public void makeNoise(Animal animal) {
        System.out.println("hippo noise");
    }
    public void eat(Animal animal) {
        System.out.println("Fruit");
    }
}
