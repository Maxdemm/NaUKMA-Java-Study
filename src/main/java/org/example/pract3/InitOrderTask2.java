package org.example.pract3;
/**
 * InitOrderTask2 -- тестовий клас для запуску прикладу.
 * Створює об'єкт ChildInit2, що дозволяє наочно
 * прослідкувати порядок виконання:
 * static-блоків, instance-блоків та конструкторів
 * при наслідуванні класів у Java.
 */
public class InitOrderTask2 {
    public static void main(String[] args) {
        InitOrderTask2 iot = new InitOrderTask2();
        iot.run();
    }

    public void run() {
        new ChildInit2();
    }
}
