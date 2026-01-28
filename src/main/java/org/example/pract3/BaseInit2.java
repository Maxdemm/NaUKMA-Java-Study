package org.example.pract3;
/**
 * Базовий клас для демонстрації порядку ініціалізації в Java.
 * Містить:
 * - static-блок (виконується під час завантаження класу);
 * - instance-блок (виконується під час створення об'єкта);
 * - конструктор класу.
 * Використовується як суперклас у прикладі наслідування.
 */
public class BaseInit2 {
    static {
        System.out.println("BaseInit static block");
    }

    {
        System.out.println("BaseInit instance block");
    }

    BaseInit2() {
        System.out.println("BaseInit constructor");
    }
}
