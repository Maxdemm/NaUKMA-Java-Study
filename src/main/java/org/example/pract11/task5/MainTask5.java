package org.example.pract11.task5;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainTask5 {
    public record Book(String title, String author, int year, List<String> tags) {}
    public record Sale(String customerEmail, String product, int cents) {}

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Clean Code", "Robert Martin", 2008, List.of("clean", "practice", "java")),
                new Book("Effective Java", "Joshua Bloch", 2018, List.of("java", "best", "api")),
                new Book("Modern Java", "Nicolai Parlog", 2020, List.of("java", "streams", "records")),
                new Book("Java Concurrency", "Brian Goetz", 2006, List.of("concurrency", "java"))
        );

        List<Sale> sales = List.of(
                new Sale("a@ex.com", "Tea", 120),
                new Sale("b@ex.com", "Cake", 200),
                new Sale("a@ex.com", "Tea", 120),
                new Sale("c@ex.com", "Coffee", 150),
                new Sale("b@ex.com", "Cake", 200)
        );

        Map<Boolean, List<Book>> recentVsOld = books.stream()
                .collect(Collectors.partitioningBy(b -> b.year() > 2015));

        List<Book> recentBooks = recentVsOld.get(true);
        List<Book> oldBooks = recentVsOld.get(false);

        System.out.println(recentBooks);
        System.out.println(oldBooks);

        Map<String, Integer> sorted = sales.stream()
                .collect(Collectors.toMap(
                        Sale::product,
                        Sale::cents,
                        Integer::sum,
                        TreeMap::new
                ));

        System.out.println(sorted);
    }
}