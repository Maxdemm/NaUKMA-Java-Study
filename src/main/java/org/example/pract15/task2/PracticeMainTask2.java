package org.example.pract15.task2;

public class PracticeMainTask2 {
    public static void main(String[] args) {
        PaymentService card = ServiceFactory.create("CardPaymentService");
        PaymentService cash = ServiceFactory.create("CashPaymentService");

        card.pay(100.3);
        cash.pay(4.2);
    }
}
