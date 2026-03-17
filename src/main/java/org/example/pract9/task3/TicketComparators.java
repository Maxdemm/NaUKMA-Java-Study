package org.example.pract9.task3;

import java.util.Comparator;

public class TicketComparators {

    public static class ByPriority implements Comparator<Ticket> {

        @Override
        public int compare(Ticket o1, Ticket o2) {
            return Integer.compare(o1.getPriority(), o2.getPriority());
        }
    }

    public static class ByCreatedAt implements Comparator<Ticket> {
        @Override
        public int compare(Ticket a, Ticket b) {
            return a.getCreatedAt().compareTo(b.getCreatedAt());
        }
    }

    public static final Comparator<Ticket> BY_PRIORITY = new ByPriority();
    public static final Comparator<Ticket> BY_CREATED_AT = new ByCreatedAt();

    public static final Comparator<Ticket> BY_PRIORITY_THEN_CREATED_AT =
            BY_PRIORITY.thenComparing(BY_CREATED_AT);
}
