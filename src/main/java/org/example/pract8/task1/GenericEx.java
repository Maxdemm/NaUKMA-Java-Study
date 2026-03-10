package org.example.pract8.task1;
import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("то теж стрічка");

        String s1 = list.get(0);

        System.out.println(s1);
    }
}
