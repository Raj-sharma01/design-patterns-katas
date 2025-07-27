package org.example;

public class CapitalLetterRule implements ValidationRule{
    private static final String CAPITALLETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public boolean validate(String password) {
        for(char c : CAPITALLETTERS.toCharArray()){
            if(password.contains(""+c)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "password must contain at least one capital letter.";
    }


}
