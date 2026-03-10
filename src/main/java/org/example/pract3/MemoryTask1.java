package org.example.pract3;

/**
 * Ця коротка програма пояснює місце зберігання примітивної змінної, об'єктів та масиву з певними елементами
 */
public class MemoryTask1 {
    public static void main(String[] args) {
        MemoryTask1 task = new MemoryTask1();
        task.run();
    }

    public void run() {
        int testInt = 12;
        System.out.println(testInt + " -- примітивна змінна зберігається у Stack");

        StringBuffer testObj = new StringBuffer("some string");
        System.out.println(testObj + " -- посилання на об'єкт зберігається в Stack, сам об'єкт -- у Heap");

        int [] testArray = {1, 2, 3, 4, 0, -1};
        for (int n: testArray)
            System.out.print(n + "\t");
        System.out.println("Посилання на масив зберігається у Stack, а сам масив та значення його елементів у Heap");

    }
}
