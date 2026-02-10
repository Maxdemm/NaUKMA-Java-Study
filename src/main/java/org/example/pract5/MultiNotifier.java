package org.example.pract5;

public class MultiNotifier implements SmsNotifier, EmailNotifier {

    @Override
    public void send(String s) {
        SmsNotifier.super.send(s);
        EmailNotifier.super.send(s);
    }
}
