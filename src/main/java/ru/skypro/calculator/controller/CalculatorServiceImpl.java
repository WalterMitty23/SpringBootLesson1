package ru.skypro.calculator.controller;

import org.springframework.stereotype.Service;
import ru.skypro.calculator.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}