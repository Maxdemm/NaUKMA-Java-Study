package org.example.pract10.task2;

import org.example.pract10.task1.Event;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EventLab {

    public static List<Event> pick(List<Event> events, Predicate<Event> predicate) {
        List<Event> result = new ArrayList<>();
        for (Event e: events) {
            if (predicate.test(e))
                result.add(e);
        }
        return result;
    }

    public static List<String> labels(List<Event> events, Function<Event, String> function) {
        List<String> result = new ArrayList<>();
        for (Event e: events)
            result.add(function.apply(e));
        return result;
    }

    public static void notifyAll(List<Event> events, Consumer<Event> consumer) {
        for (Event e: events)
            consumer.accept(e);
    }

    public static Event create(Supplier<Event> supplier) {
        return supplier.get();
    }

    public static void findConflicts(List<Event> events) {
        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j < events.size(); j++) {
                Event a = events.get(i);
                Event b = events.get(j);

                Instant startA = a.getStart().atZone(a.getZone()).toInstant();
                Instant endA = a.end().toInstant();
                Instant startB = b.getStart().atZone(b.getZone()).toInstant();
                Instant endB = b.end().toInstant();

                if (startA.isBefore(endB) && endA.isAfter(startB))
                    System.out.println(a.getTitle() + " conflict  " + b.getTitle());
            }
        }
    }
}
