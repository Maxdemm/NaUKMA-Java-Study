package org.example.pract9.task2;

public class TicketService {

    public String buildTicketId(String base) {
        int year = 2026;

        class IdBuilder {
            public String build() {
                return base + " " + year;
            }
        }

        IdBuilder ib = new IdBuilder();
        return ib.build();
    }

    public Runnable runnable() {

        return  new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable task2");
            }
        };
    }

    public static void main(String[] args) {
        TicketService ts= new TicketService();
        System.out.println(ts.buildTicketId("aaaaaaaa"));

        Runnable runnable = ts.runnable();
        runnable.run();
    }
}
