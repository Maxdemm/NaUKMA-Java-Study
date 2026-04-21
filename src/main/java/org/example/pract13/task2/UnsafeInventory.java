package org.example.pract13.task2;

class UnsafeInventory implements Inventory {
    private int items;

    public UnsafeInventory(int items) {
        this.items = items;
    }

    @Override
    public boolean reserve(int amount) {
        if (items >= amount) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ignored) {}
            items -= amount;
            return true;
        }
        return false;
    }

    @Override
    public int available() {
        return items;
    }
}
