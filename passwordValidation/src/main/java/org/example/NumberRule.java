package org.example;

public class NumberRule implements ValidationRule{
    private static final String NUMBERS = "0123456789";

    @Override
    public boolean validate(String password) {
        for(char c : NUMBERS.toCharArray()){
            if(password.contains(""+c)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "password must contain at least one number.";
    }
}
