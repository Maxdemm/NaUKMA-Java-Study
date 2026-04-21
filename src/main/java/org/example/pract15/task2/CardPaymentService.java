package org.example.pract15.task2;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("CardPaymentService: " + amount);
    }
}
