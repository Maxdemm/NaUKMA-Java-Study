package org.example.pract7;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ReceiptWriter implements AutoCloseable {
    private static final Logger log = LoggerFactory.getLogger(ReceiptWriter.class);

    public void write(String text) throws IOException {
        log.info("Start writing receipt");
        System.out.println("Writing receipt: " + text);
        throw new IOException("Some error in write()");
    }

    @Override
    public void close() {
        System.out.println("ReceiptWriter closed");
    }
}