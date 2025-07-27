package org.example;

import java.util.List;

public class OneFailureAllowedStrategy implements ValidationStrategy{
    @Override
    public boolean validate(List<ValidationRule> rules, String password) {
        int failCount=0;
        for(ValidationRule rule:rules){
            if(!rule.validate(password)) failCount++;
        }
        return failCount<=1;
    }
}
