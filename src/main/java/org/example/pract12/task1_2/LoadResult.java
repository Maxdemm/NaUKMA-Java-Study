package org.example.pract12.task1_2;

import java.util.List;

public record LoadResult(List<Payment> payments, int invalidLines) {}
