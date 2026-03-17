<<<<<<< feature/nested-lambda-lab
package org.example.pract5;

public class PayPalPayment implements PaymentMethod {
    @Override
    public String name() {
        return "PayPalPayment";
    }

    @Override
    public void pay(int amount) {
        System.out.println("paypal | сума: " + amount);
    }
}
=======
package org.example.pract5;

public class PayPalPayment implements PaymentMethod {
    @Override
    public String name() {
        return "PayPalPayment";
    }

    @Override
    public void pay(int amount) {
        System.out.println("paypal | сума: " + amount);
    }
}
>>>>>>> master
