package org.example;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, dog.breed);
    }

}

