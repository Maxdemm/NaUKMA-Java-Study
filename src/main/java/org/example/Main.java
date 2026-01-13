package org.example;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("name1", "breed1");
        System.out.println(dog);

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        for (int i = -128; i <= 127; i++) {
            Integer a = i;
            Integer b = i;
            System.out.println(a == b);
        }

        Dog dog1 = new Dog("name2", "breed2");
        Dog dog2 = new Dog("name3", "breed3");
        System.out.println(dog1.equals(dog2));

        Animal a = new Dog("name4", "breed4");
        feed(a);
    }

    public static void feed(Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}

