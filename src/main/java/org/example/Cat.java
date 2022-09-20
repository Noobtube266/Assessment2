package org.example;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void makeNoise(Animal animal) {
        System.out.println("Meow Mew");
    }
}
