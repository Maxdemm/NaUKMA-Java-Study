package org.example.pract5;

public interface EmailNotifier {
    default void send(String s) {
        System.out.println("email | " + s);
    }
}
