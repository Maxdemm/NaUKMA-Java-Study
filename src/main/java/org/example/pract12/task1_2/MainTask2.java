package org.example.pract12.task1_2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MainTask2 {
    public static void main(String[] args) {
        Path input = Paths.get("payments.csv");
        Path report = Paths.get("report.txt");

        LoadResult result = PaymentLoader.loadWithStats(input);
        PaymentReportWriter.writeReport(report, result.payments(), result.invalidLines());

        System.out.println("Звіт створено: " + report.toAbsolutePath());
    }
}
