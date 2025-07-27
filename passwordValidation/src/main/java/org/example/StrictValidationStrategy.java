package org.example;

import java.util.List;

public class StrictValidationStrategy implements ValidationStrategy {
    @Override
    public boolean validate(List<ValidationRule> rules, String password) {
        for(ValidationRule rule:rules){
            if(!rule.validate(password)) return false;
        }
        return true;
    }
}
