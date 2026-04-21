package org.example.pract15.task2;

public class ServiceFactory {
    public static PaymentService create(String className) {
        try {
            Class<?> clazz = Class.forName("org.example.pract15.task2." + className);
            return (PaymentService) clazz.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
