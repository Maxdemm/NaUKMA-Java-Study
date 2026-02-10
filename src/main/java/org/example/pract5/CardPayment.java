package org.example.pract5;

public class CardPayment implements PaymentMethod {
    @Override
    public String name() {
        return "CardPayment";
    }

    @Override
    public void pay(int amount) {
        System.out.println("card | сума: " + amount);
    }
}
