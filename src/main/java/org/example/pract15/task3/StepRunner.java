package org.example.pract15.task3;

import java.lang.reflect.Method;
import java.util.*;

public class StepRunner {
    public static void run(Object target) {
        List<Method> steps = new ArrayList<>();
        for (Method method : target.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Step.class)) {
                if (method.getParameterCount() != 0 || method.getReturnType() != void.class) {
                    throw new RuntimeException("Invalid signature in: " + method.getName());
                }
                steps.add(method);
            }
        }
        steps.sort(Comparator.comparingInt(m -> m.getAnnotation(Step.class).order()));
        for (Method method : steps) {
            try {
                method.setAccessible(true);
                method.invoke(target);
            } catch (Exception e) {
                throw new RuntimeException("Execution failed: " + method.getName(), e.getCause());
            }
        }
    }
}
