package org.example.pract12.task5;

import java.io.IOException;
import java.nio.file.Path;

public class StatusFileMainTask5 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("status.bin");

        StatusFile.createEmptyFile(path, 10);
        System.out.println("створено");

        byte newStatus = 1;
        StatusFile.updateStatus(path, 4, newStatus);
        System.out.println("оновлено");

        byte check = StatusFile.readStatus(path, 4);
        System.out.println("Прочитанo: " + check);
    }
}
