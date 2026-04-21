package org.example.pract13.task4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static final SupportTicket POISON_PILL = new SupportTicket(-1, "System", "STOP");

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<SupportTicket> queue = new ArrayBlockingQueue<>(100);
        ConcurrentHashMap<String, Integer> stats = new ConcurrentHashMap<>();

        Runnable producer = () -> {
            try {
                queue.put(new SupportTicket(1, "cust1", "Оплата"));
                queue.put(new SupportTicket(2, "cust2", "Повернення"));
                queue.put(new SupportTicket(3, "cust3", "Оплата"));

                queue.put(POISON_PILL);
                queue.put(POISON_PILL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    SupportTicket ticket = queue.take();

                    if (ticket == POISON_PILL)
                        break;
                    stats.merge(ticket.topic(), 1, Integer::sum);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread p1 = new Thread(producer);
        Thread c1 = new Thread(consumer);
        Thread c2 = new Thread(consumer);

        c1.start();
        c2.start();
        p1.start();
        p1.join();
        c1.join();
        c2.join();

        System.out.println("Статистика за темами: " + stats);
    }
}
