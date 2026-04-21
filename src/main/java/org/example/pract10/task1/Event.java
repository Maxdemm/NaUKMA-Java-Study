package org.example.pract10.task1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Event {
    private String title;
    private LocalDateTime start;
    private int durationMinutes;
    private ZoneId zone;
    private String track;

    public Event(String title, LocalDateTime start, int durationMinutes, ZoneId zone, String track) {
        this.title = title;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.zone = zone;
        this.track = track;
    }

    public ZonedDateTime end() {
        ZonedDateTime zonedStart = ZonedDateTime.of(start, zone);
        return zonedStart.plusMinutes(durationMinutes);
    }

    public String label() {
        return title + " (" + track + ")";
    }

    public String getTitle() {
        return title;
    }
    public String getTrack() {
        return track;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public ZoneId getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", start=" + start +
                ", durationMinutes=" + durationMinutes +
                ", zone=" + zone +
                ", track='" + track + '\'' +
                '}';
    }
}
