package org.example;

public interface ValidationRule {
    boolean validate(String password);

    String errorMessage();
}
