package org.example.pract7;

public class SimpleLogger implements Logger {

    @Override
    public void info(String message, Object... args) {
        log("INFO", message, args);
    }

    @Override
    public void warn(String message, Object... args) {
        log("WARN", message, args);
    }

    @Override
    public void error(String message, Object... args) {
        log("ERROR", message, args);
    }

    private void log(String level, String message, Object... args) {
        for (Object arg : args)
            message = message.replaceFirst("\\{}", arg.toString());

        System.out.println(level + ": " + message);
    }
}
