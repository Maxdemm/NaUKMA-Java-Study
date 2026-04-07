package org.example.pract12.task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PaymentLoader {

    public static LoadResult loadWithStats(Path csv) {
        List<Payment> payments = new ArrayList<>();
        int invalidLines = 0;

        try (BufferedReader reader = Files.newBufferedReader(csv)) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;

                try {
                    String[] parts = line.split(",");
                    if (parts.length != 4) throw new IllegalArgumentException();

                    payments.add(new Payment(parts[0].trim(), parts[1].trim(),
                            PaymentStatus.valueOf(parts[2].trim().toUpperCase()),
                            Long.parseLong(parts[3].trim())
                    ));
                } catch (Exception e) {
                    invalidLines++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new LoadResult(payments, invalidLines);
    }
}
