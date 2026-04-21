package org.example.pract12.task4;

import java.nio.file.Path;

public class SafetyMainTask4 {
    public static void main(String[] args) {
        Path base = Path.of("/reports");

        try {
            Path p1 = PathSafety.safeResolve(base, "2025.txt");
            System.out.println("Ок: " + p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Path p2 = PathSafety.safeResolve(base, "../nono.txt");
            System.out.println("Ок: " + p2);
        } catch (IllegalArgumentException e) {
            System.err.println("НЕ можна: " + e.getMessage());
        }
    }
}
