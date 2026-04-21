package org.example.pract10.task4;

import org.example.pract10.task1.Event;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

    public static Instant toInstant(Event e) {
        return e.getStart().atZone(e.getZone()).toInstant();
    }

    public static long minutesBetween(Event a, Event b) {
        Instant startA = toInstant(a);
        Instant startB = toInstant(b);
        return Math.abs(Duration.between(startA, startB).toMinutes());
    }

    public static ZonedDateTime startInZone(Event e, String zone) {
        return e.getStart().atZone(e.getZone()).withZoneSameInstant(ZoneId.of(zone));
    }
}