package org.example.pract7;

import org.example.pract7.exception.OrderProcessingException;
import org.example.pract7.exception.ReceiptGenerationException;

public class Main {

    public static void main(String[] args) {
/*

        OrderService service = new OrderService();
        Order order = new Order(1, "user@mail.com", 1500);

        try {
            service.checkout(order);
        } catch (OrderProcessingException e) {
            System.out.println("Error happened: " + e.getMessage());
        }*/

        // -------------task2----------
        /*ReceiptService service = new ReceiptService();
        try {
            service.generate();
        } catch (ReceiptGenerationException e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        OrderService service = new OrderService();

        service.checkout(new Order(1, "user1@mail.com", 100));
        service.checkout(new Order(2, "user2@mail.com", 100));
        service.checkout(new Order(3, "user3@mail.com", 100));
    }
}