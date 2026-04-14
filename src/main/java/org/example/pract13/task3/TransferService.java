package org.example.pract13.task3;

class TransferService {
    public static void transfer(Account from, Account to, int amount) {
        Account smallerIdAccount;
        Account largerIdAccount;

        if (from.id < to.id) {
            smallerIdAccount = from;
            largerIdAccount = to;
        } else {
            smallerIdAccount = to;
            largerIdAccount = from;
        }

        synchronized (smallerIdAccount) {
            synchronized (largerIdAccount) {
                if (from.balance >= amount) {
                    from.balance -= amount;
                    to.balance += amount;
                }
            }
        }
    }
}
