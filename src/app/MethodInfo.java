package app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Анотація для зберігання інформації про метод
@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
    String name();
    String returnType();
    String description();
}

// Анотація для зберігання інформації про автора методу
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String firstName();
    String lastName();
}
