package org.example.pract13.task3;

public class MainTask3 {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account(1, 1000);
        Account acc2 = new Account(2, 1000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                TransferService.transfer(acc1, acc2, 10);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                TransferService.transfer(acc2, acc1, 10);
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Баланс acc1: " + acc1.balance);
        System.out.println("Баланс acc2: " + acc2.balance);
    }
}
