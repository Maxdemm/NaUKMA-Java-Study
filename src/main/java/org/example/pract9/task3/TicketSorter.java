package org.example.pract9.task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TicketSorter {

    public static void sortByPriority(List<Ticket>tickets){
        Collections.sort(tickets, new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
        });
    }

    public static void sortByPriorityLambda(List<Ticket> tickets) {
        tickets.sort((a, b) -> Integer.compare(a.getPriority(), b.getPriority()));
    }

    public static void sortByPriorityMethodRef(List<Ticket> tickets) {
        tickets.sort(Comparator.comparingInt(Ticket::getPriority));
    }

    public static void sortByCreatedAt(List<Ticket> tickets) {
        tickets.sort(Comparator.comparing(Ticket::getCreatedAt));
    }
}
