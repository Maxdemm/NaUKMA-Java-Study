package org.example.pract7;

import java.util.Objects;

public record Order(long id, String userEmail, long totalCents) {

    public Order {
        if (id <= 0)
            throw new IllegalArgumentException("id must be > 0");

        if (userEmail == null || !userEmail.contains("@"))
            throw new IllegalArgumentException("wrong email");

        if (totalCents < 0)
            throw new IllegalArgumentException("totalCents must be >= 0");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && totalCents == order.totalCents && Objects.equals(userEmail, order.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userEmail, totalCents);
    }
}