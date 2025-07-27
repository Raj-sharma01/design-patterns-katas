package org.example;

public class SmallLetterRule implements ValidationRule{
    private static final String SMALLLETTERS = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public boolean validate(String password) {
        for(char c : SMALLLETTERS.toCharArray()){
            if(password.contains(""+c)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "password must contain at least one small letter.";
    }
}
