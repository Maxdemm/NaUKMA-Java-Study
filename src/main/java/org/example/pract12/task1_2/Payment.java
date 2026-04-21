package org.example.pract12.task1_2;

public record Payment(String id, String email, PaymentStatus status, long amountCents) {}
