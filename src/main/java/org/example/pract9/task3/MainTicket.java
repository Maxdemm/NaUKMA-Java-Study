package org.example.pract9.task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainTicket {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(2, LocalDateTime.of(2026, 3, 17, 10, 30)));
        tickets.add(new Ticket(1, LocalDateTime.of(2026, 3, 17, 9, 15)));
        tickets.add(new Ticket(1, LocalDateTime.of(2026, 3, 17, 11, 0)));
        tickets.add(new Ticket(3, LocalDateTime.of(2026, 3, 16, 18, 45)));

        TicketService service = new TicketService();

        service.sortTickets(tickets, "priorityThenCreatedAt");

        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
