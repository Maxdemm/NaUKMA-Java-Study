package org.example.pract8.task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTask2 {

    public static <T> T firstOrNull(List<T> list) {
        if (list == null || list.isEmpty())
            return null;
        return list.get(0);
    }

    public static double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list)
            result += number.doubleValue();
        return result;
    }

    public static void addDefaultIds(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(33);
    }

    public static void main(String[] args) {
        List<String> dogs = Arrays.asList("Barsik", "Rex", "Просто пес");
        List<String> empty = new ArrayList<>();

        System.out.println("firstOrNull dog = " + firstOrNull(dogs));
        System.out.println("firstOrNull empty = " + firstOrNull(empty));

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<Double> numbersDouble = Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("sum int = " + sum(numbers));
        System.out.println("sum double = " + sum(numbersDouble));

        List<Integer> ids = new ArrayList<>();
        addDefaultIds(ids);
        System.out.println("ids = " + ids);
    }
}
