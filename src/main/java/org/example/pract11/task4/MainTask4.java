package org.example.pract11.task4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTask4 {
    sealed interface Result permits Success, Failure {}
    public record Success(String data) implements Result {}
    public record Failure(String message) implements Result {}

    public static void main(String[] args) {
        List<Result> results = List.of(
                new Success("Data 1"),
                new Failure("Failure 1"),
                new Success("Data 2"),
                new Failure("Failure 2"),
                new Success("Data 3")
        );

        Map<String, Long> counts = results.stream()
                .collect(Collectors.groupingBy(
                        res -> {
                            if (res instanceof Success)
                                return "Success";
                            else
                                return "Failure";
                        },
                        Collectors.counting()
                ));

        System.out.println(counts);

        List<String> errorMessages = results.stream()
                .filter(res -> res instanceof Failure)
                .map(res -> ((Failure) res).message())
                .toList();

        System.out.println(errorMessages);
    }
}
