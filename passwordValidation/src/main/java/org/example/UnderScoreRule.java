package org.example;

public class UnderScoreRule implements ValidationRule{
    @Override
    public boolean validate(String password) {
        return password.contains("_");
    }

    @Override
    public String errorMessage() {
        return "password must contain at least one underscore.";
    }
}
