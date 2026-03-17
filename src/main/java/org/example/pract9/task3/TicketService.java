package org.example.pract9.task3;

import java.util.Comparator;
import java.util.List;

public class TicketService {

    public void sortTickets(List<Ticket> tickets, String strategy) {
        Comparator<Ticket> comparator = chooseComparator(strategy);
        tickets.sort(comparator);
    }

    private Comparator<Ticket> chooseComparator(String strategy) {
        return switch (strategy) {
            case "priority" -> TicketComparators.BY_PRIORITY;
            case "createdAt" -> TicketComparators.BY_CREATED_AT;
            case "priorityThenCreatedAt" -> TicketComparators.BY_PRIORITY_THEN_CREATED_AT;
            default -> throw new IllegalArgumentException("Unknown strategy: " + strategy);
        };
    }
}
