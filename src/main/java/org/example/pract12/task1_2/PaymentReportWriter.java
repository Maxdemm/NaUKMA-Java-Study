package org.example.pract12.task1_2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PaymentReportWriter {

    public static void writeReport(Path out, List<Payment> payments, int invalidLines) {
        Path tempFile = out.resolveSibling(out.getFileName() + ".tmp");

        long paidTotalCents = 0;
        int newCount = 0;
        int paidCount = 0;
        int failedCount = 0;

        for (Payment p: payments) {
            if (p.status() == PaymentStatus.PAID) {
                paidTotalCents += p.amountCents();
                paidCount++;
            } else if (p.status() == PaymentStatus.NEW) {
                newCount++;
            } else if (p.status() == PaymentStatus.FAILED) {
                failedCount++;
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(tempFile)) {
            writer.write("invalidLines=" + invalidLines);
            writer.newLine();
            writer.write("paidTotalCents=" + paidTotalCents);
            writer.newLine();
            writer.write(String.format("NEW=%d, PAID=%d, FAILED=%d", newCount, paidCount, failedCount));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try {
            Files.move(tempFile, out, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            try {
                Files.move(tempFile, out, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}