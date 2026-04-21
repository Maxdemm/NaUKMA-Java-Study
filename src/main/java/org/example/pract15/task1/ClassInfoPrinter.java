package org.example.pract15.task1;

import java.util.Arrays;

public class ClassInfoPrinter {

    public static void print(Class<?> clazz) {
        System.out.println(clazz.getName());
        System.out.println(clazz.getSuperclass());
        System.out.println(Arrays.toString(clazz.getInterfaces()));
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
    }
}

