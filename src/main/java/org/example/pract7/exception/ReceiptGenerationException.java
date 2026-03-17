package org.example.pract7.exception;

public class ReceiptGenerationException extends RuntimeException {

    public ReceiptGenerationException(String message, Throwable cause) {
        super(message, cause);
    }
}
