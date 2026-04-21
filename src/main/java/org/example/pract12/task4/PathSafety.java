package org.example.pract12.task4;

import java.nio.file.Path;

public class PathSafety {

    public static Path safeResolve(Path base, String userInput) {
        Path basePath = base.toAbsolutePath().normalize();
        Path resolvedPath = basePath.resolve(userInput).normalize();

        if (!resolvedPath.startsWith(basePath))
            throw new IllegalArgumentException("не можна!!! алоооооо");

        return resolvedPath;
    }
}
