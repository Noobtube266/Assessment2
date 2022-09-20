package org.example;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }
    public void makeNoise(Animal animal) {
        System.out.println("Louder Rawr");
    }
    public void eat(Animal animal) {
        System.out.println("Meat");
    }
}
