package org.example.pract5;

public interface SmsNotifier {
    default void send(String s) {
        System.out.println("sms | " + s);
    }
}
