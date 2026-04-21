package org.example.pract9.task3;

import java.time.LocalDateTime;

public class Ticket {
    private final int priority;
    private final LocalDateTime createdAt;

    public Ticket(int priority, LocalDateTime createdAt) {
        this.priority = priority;
        this.createdAt = createdAt;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "priority=" + priority +
                ", createdAt=" + createdAt +
                '}';
    }
}
