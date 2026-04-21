package org.example.pract12.task3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class InboxArchiver {

    public static void archiveTmpFiles(Path inbox, Path archive) {
        try {
            if (Files.notExists(archive))
                Files.createDirectories(archive);

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(inbox, "*.tmp")) {
                for (Path file: stream) {
                    Path target = archive.resolve(file.getFileName());

                    Files.move(file, target, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Архівовано: " + file.getFileName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
