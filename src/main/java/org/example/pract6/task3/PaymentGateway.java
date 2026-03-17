package org.example.pract6.task3;

import org.example.pract6.task3.Money;
import org.example.pract6.task3.PaymentResult;

import java.util.Objects;

public interface PaymentGateway {
    PaymentResult charge(Money amount, PaymentDetails details);
}

class PaymentDetails {
    private final String token;

    public PaymentDetails(String token) {
        this.token = Objects.requireNonNull(token, "token");
    }

    public String token() {
        return token;
    }
}

class StripePaymentGateway implements PaymentGateway {
    @Override
    public PaymentResult charge(Money amount, PaymentDetails details) {
        return PaymentResult.ok();
    }
}

class FakePaymentGateway implements PaymentGateway {
    private boolean fail;

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    @Override
    public PaymentResult charge(Money amount, PaymentDetails details) {
        return fail ? PaymentResult.fail("Card declined") : PaymentResult.ok();
    }
}
