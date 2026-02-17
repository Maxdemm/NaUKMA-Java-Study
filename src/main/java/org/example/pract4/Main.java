package org.example.pract4;

public class Main {
    public static void main(String[] args) {
        // ========== Task 1 =========
        Animal [] animals = {new Dog(), new Cat(), new Dog()};

        for(Animal a: animals)
            a.speak();

        // ========== Task 2 =========
        Animal a = new Dog();
        Animal b = new Cat();

        if (a instanceof Dog)
            ((Dog) a).fetchStick();

        if (b instanceof Dog)
            ((Dog) b).fetchStick();

    }

}
