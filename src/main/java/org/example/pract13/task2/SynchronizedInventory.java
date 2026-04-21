package org.example.pract13.task2;

class SynchronizedInventory implements Inventory {
    private int items;
    private final Object lock = new Object();

    public SynchronizedInventory(int items) {
        this.items = items;
    }

    @Override
    public boolean reserve(int amount) {
        synchronized (lock) {
            if (items >= amount) {
                items -= amount;
                return true;
            }
            return false;
        }
    }

    @Override
    public int available() {
        synchronized (lock) {
            return items;
        }
    }
}
