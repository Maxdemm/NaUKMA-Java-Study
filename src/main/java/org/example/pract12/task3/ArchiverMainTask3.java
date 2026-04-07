package org.example.pract12.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArchiverMainTask3 {
    public static void main(String[] args) throws IOException {
        Path inbox = Paths.get("practical-data/inbox");
        Path archive = Paths.get("practical-data/archive");

        Files.createDirectories(inbox);
        Files.writeString(inbox.resolve("f1.tmp"), "lalallalal111");
        Files.writeString(inbox.resolve("t2.tmp"), "lalallalal2222");
        Files.writeString(inbox.resolve("txt1.txt"), "no no no no");

        InboxArchiver.archiveTmpFiles(inbox, archive);

        System.out.println("Кінець");
    }
}
