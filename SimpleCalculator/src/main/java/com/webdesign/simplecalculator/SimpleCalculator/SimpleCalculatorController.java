package com.webdesign.simplecalculator.SimpleCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {
    private final SimpleCalculatorService service;


    @Autowired
    public SimpleCalculatorController(SimpleCalculatorService service) {
        this.service = service;
    }


    @GetMapping("/{operation}/{num1}/{num2}")
    public String calculateProduct(@PathVariable String operation, @PathVariable int num1, @PathVariable int num2) {
        return switch (operation) {
            case "sum" -> String.format("%d", service.sum(num1, num2));
            case "subtract" -> String.format("%d", service.sub(num1, num2));
            case "div" -> String.format("%d", service.div(num1, num2));
            case "mult" -> String.format("%d", service.mult(num1, num2));
            default -> "Error!";
        };
    }
}




