package org.example.pract9.task4;

public class MainLombok {
    public static void main(String[] args) {

        CheckoutRequest request = CheckoutRequest.builder().userId("user-1").totalAmount(150.0).currency("USD").build();
        System.out.println(request);
    }
}
