package org.example.pract11.task2;

import org.example.pract11.task1.Book;

import java.util.List;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainTask2 {
    public record Book(String title, String author, int year, List<String> tags) {}

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Clean Code", "Robert Martin", 2008, List.of("clean", "practice", "java")),
                new Book("Effective Java", "Joshua Bloch", 2018, List.of("java", "best", "api")),
                new Book("Modern Java", "Nicolai Parlog", 2020, List.of("java", "streams", "records")),
                new Book("Java Concurrency", "Brian Goetz", 2006, List.of("concurrency", "java"))
        );

        List<String> sortedTags = books.stream()
                .flatMap(book -> book.tags().stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println(sortedTags);


        Map<String, Long> tagFrequency  = books.stream()
                .flatMap(book -> book.tags().stream())
                .collect(Collectors.groupingBy(tag -> tag, Collectors.counting()));

        tagFrequency.forEach((tag, count) -> System.out.println(tag + ": " + count));

        tagFrequency .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey() + " (" + entry.getValue() + ")"));

    }
}
