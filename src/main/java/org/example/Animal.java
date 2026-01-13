package org.example;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }
}

