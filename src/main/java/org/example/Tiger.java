package org.example;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void makeNoise(Animal animal) {
        System.out.println("Rawr");
    }
}