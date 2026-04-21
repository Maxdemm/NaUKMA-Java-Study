package org.example.pract13.task2;

public class MainTask2 {
    public static void main(String[] args) throws InterruptedException {
        Inventory unsafe = new UnsafeInventory(100);
        runTest(unsafe);
        System.out.println("Unsafe залишок: " + unsafe.available());

        Inventory safe = new SynchronizedInventory(100);
        runTest(safe);
        System.out.println("Safe залишок: " + safe.available());

        int failures = 0;
        for (int i = 0; i < 500; i++) {
            Inventory inv = new UnsafeInventory(100);
            runTest(inv);
            if (inv.available() < 0) {
                failures++;
            }
        }
        System.out.println("Помилок у тесті: " + failures + " з 500");
    }

    private static void runTest(Inventory inv) throws InterruptedException {
        Thread t1 = new Thread(() -> inv.reserve(60));
        Thread t2 = new Thread(() -> inv.reserve(60));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
