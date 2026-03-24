package org.example.pract10.task2;

import org.example.pract10.task1.Event;
import org.example.pract10.task2.EventLab;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainEventLabTask2 {
    public static void main(String[] args) {
        ZoneId kyivZone = ZoneId.of("Europe/Kyiv");
        ZoneId londonZone = ZoneId.of("Europe/London");

        Event event1 = new Event("якась подія 1", LocalDateTime.of(2026, Month.MARCH, 24, 10, 0), 45, kyivZone, "трек 1");
        Event event2 = new Event("якась подія 2", LocalDateTime.of(2026, Month.MARCH, 24, 11, 0), 90, kyivZone, "шо таке трек");
        Event event3 = new Event("то вже 3", LocalDateTime.of(2026, Month.MARCH, 24, 10, 30), 180, londonZone, "трек 3");
        Event event4 = EventLab.create(() -> new Event("а то вже 4 подія", LocalDateTime.of(2026, Month.MARCH, 24, 12, 30), 30, kyivZone, "track"));

        List<Event> events = Arrays.asList(event1, event2, event3, event4);

        Predicate<Event> before12 = e -> e.getStart().getHour() < 12;
        Predicate<Event> isTrack = e -> "шо таке трек".equals(e.getTrack());
        Predicate<Event> filter = before12.and(isTrack.negate());

        List<Event> pickedEvents = EventLab.pick(events, filter);

        List<String> labels = EventLab.labels(pickedEvents, e -> e.label());
        labels.forEach(System.out::println);
        EventLab.notifyAll(pickedEvents, e -> System.out.println(e.getTitle()));
        EventLab.findConflicts(events);
    }
}