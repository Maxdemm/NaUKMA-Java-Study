package org.example.pract11.task3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTask3 {
    public record Sale(String customerEmail, String product, int cents) {}

    public static void main(String[] args) {
        List<Sale> sales = List.of(
                new Sale("a@ex.com", "Tea", 120),
                new Sale("b@ex.com", "Cake", 200),
                new Sale("a@ex.com", "Tea", 120),
                new Sale("c@ex.com", "Coffee", 150),
                new Sale("b@ex.com", "Cake", 200)
        );

        Map<String, Integer> productMap = sales.stream()
                .collect(Collectors.toMap(
                        Sale::product,
                        Sale::cents,
                        Integer::sum
                ));

        System.out.println(productMap);

        Map<String, Long> transactionsPerCustomer = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::customerEmail,
                        Collectors.counting()
                ));

        System.out.println(transactionsPerCustomer);
    }
}
