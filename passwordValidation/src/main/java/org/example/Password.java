package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Password {

    private String passwordString;
    List<ValidationRule> validationRuleList;
    ValidationStrategy validationStrategy;

    public boolean validatePassword(){
        return validationStrategy.validate(validationRuleList,passwordString);
    }

    public List<String> getFailedRules(){
        List<String> errorList= new ArrayList<>();

        for(ValidationRule rule:validationRuleList){
            if(!rule.validate(passwordString))
                errorList.add(rule.errorMessage());
        }
        return errorList;
    }
}
