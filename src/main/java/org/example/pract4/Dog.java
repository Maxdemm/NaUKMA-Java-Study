package org.example.pract4;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog");
    }

    void fetchStick() {
        System.out.println("Dog fetchStick");
    }
}
