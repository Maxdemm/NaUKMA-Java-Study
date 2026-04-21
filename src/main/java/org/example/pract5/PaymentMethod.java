<<<<<<< feature/nested-lambda-lab
package org.example.pract5;

public interface PaymentMethod {

    String name();
    void pay(int amount);

    default int payWithFee(int amount, int fee) {
        return amount + fee;
    }

}
=======
package org.example.pract5;

public interface PaymentMethod {

    String name();
    void pay(int amount);

    default int payWithFee(int amount, int fee) {
        return amount + fee;
    }

}
>>>>>>> master
