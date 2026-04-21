package org.example.pract13.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, 1500),
                new Order(2, 4550),
                new Order(3, 990),
                new Order(4, 12000)
        );

        int[] totalSum = new int[1];
        int[] maxOrder = new int[1];

        Runnable sumTask = () -> {
            totalSum[0] = orders.stream()
                    .mapToInt(Order::totalCents)
                    .sum();
            System.out.println(Thread.currentThread().getName() + " сума");
        };

        Runnable maxTask = () -> {
            maxOrder[0] = orders.stream()
                    .mapToInt(Order::totalCents)
                    .max()
                    .orElse(0);
            System.out.println(Thread.currentThread().getName() + " максимум");
        };

        TaskRunner.runAndWait(List.of(sumTask, maxTask));

        System.out.println("сума: " + totalSum[0]);
        System.out.println("макс: " + maxOrder[0]);
    }
}