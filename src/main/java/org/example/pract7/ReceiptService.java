package org.example.pract7;

import org.example.pract7.exception.ReceiptGenerationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ReceiptService {
    private static final Logger log = LoggerFactory.getLogger(ReceiptWriter.class);

    public void generate() {
        try (ReceiptWriter writer = new ReceiptWriter()) {
            writer.write("Order receipt");
        } catch (IOException e) {
            log.warn("IOException occurred during receipt writing");
            log.error("Receipt generation failed", e);
            throw new ReceiptGenerationException("Receipt generation failed", e);
        }
    }
}