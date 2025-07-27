package org.example;

import java.util.List;

public interface ValidationStrategy {
    public boolean validate(List<ValidationRule> rules, String password);
}
