package org.example.pract9.task1;

public class Car {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    static class Engine {
        private int horsepower;

        Engine(int hp) {
            this.horsepower = hp;
        }

        public int getHorsepower(){
            return horsepower;
        }
    }

    public Engine spec() {
        return new Engine(100);
    }
}
