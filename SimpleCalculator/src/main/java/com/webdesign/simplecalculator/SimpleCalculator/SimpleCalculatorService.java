package com.webdesign.simplecalculator.SimpleCalculator;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService {
    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
