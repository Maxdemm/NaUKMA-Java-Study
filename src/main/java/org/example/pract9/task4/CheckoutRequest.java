package org.example.pract9.task4;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class CheckoutRequest {
    private String userId;
    private double totalAmount;
    private String currency;
}
