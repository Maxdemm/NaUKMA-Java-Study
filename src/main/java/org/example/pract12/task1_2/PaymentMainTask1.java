package org.example.pract12.task1_2;

import java.nio.file.Paths;

public class PaymentMainTask1 {
    public static void main(String[] args) {
        LoadResult result = PaymentLoader.loadWithStats(Paths.get("payments.csv"));
        System.out.println("Valid: " + result.payments().size());
        System.out.println("Invalid: " + result.invalidLines());
    }
}
