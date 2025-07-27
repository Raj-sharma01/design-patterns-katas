package org.example;

public class LengthRule implements ValidationRule{
    private final int minLength;

    public LengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String password) {
        return password.length()>=minLength;
    }

    @Override
    public String errorMessage() {
        return "password must have a minimum length : "+minLength;
    }
}
