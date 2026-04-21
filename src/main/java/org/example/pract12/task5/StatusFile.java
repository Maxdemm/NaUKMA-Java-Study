package org.example.pract12.task5;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class StatusFile {

    public static void createEmptyFile(Path path, int size) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw")) {
            raf.setLength(size);
        }
    }

    public static void updateStatus(Path path, long index, byte status) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw")) {
            raf.seek(index);
            raf.write(status);
        }
    }

    public static byte readStatus(Path path, long index) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "r")) {
            raf.seek(index);
            return raf.readByte();
        }
    }
}
