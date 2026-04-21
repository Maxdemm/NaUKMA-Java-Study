package org.example.pract15.task2;

public class CashPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("CashPaymentService: " + amount);
    }
}
