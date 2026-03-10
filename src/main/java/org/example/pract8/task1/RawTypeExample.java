package org.example.pract8.task1;
import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("то стрічка");
        list.add(111111);

        String s1 = (String) list.get(0);
        System.out.println(s1);

        String s2 = (String) list.get(1); // помилка
        System.out.println(s2);
    }
}
