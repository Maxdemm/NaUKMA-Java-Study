package org.example.pract4;


class A {
    void process(Object obj) {
        System.out.println("A process Object ");
    }
}

class B extends A {
    @Override
    void process(Object obj) {
        System.out.println("B process Object");
    }

    void process(String str) {
        System.out.println("B process String");
    }
}

public class MainTask2 {
    public static void main(String[] args) {
        A a = new B();

        a.process("hi");
    }
}

