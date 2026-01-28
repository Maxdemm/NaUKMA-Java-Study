package org.example.pract3;
/**
 * Дочірній клас, що наслідує BaseInit2.
 * Демонструє порядок виконання елементів класу
 * при створенні об'єкта дочірнього класу:
 * - static-блоки суперкласу та дочірнього класу;
 * - instance-блок суперкласу;
 * - конструктор суперкласу;
 * - instance-блок дочірнього класу;
 * - конструктор дочірнього класу.
 */

public class ChildInit2 extends BaseInit2 {
    static {
        System.out.println("ChildInit static block");
    }

    {
        System.out.println("ChildInit instance block");
    }

    ChildInit2() {
        System.out.println("ChildInit constructor");
    }
}
