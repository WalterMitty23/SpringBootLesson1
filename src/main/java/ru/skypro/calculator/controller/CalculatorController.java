package ru.skypro.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один или оба параметра отсутствуют.";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer num1,
                        @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один или оба параметра отсутствуют.";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer num1,
                           @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один или оба параметра отсутствуют.";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1,
                         @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один или оба параметра отсутствуют.";
        }

        if (num2 == 0) {
            return "Ошибка: Деление на 0.";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

}
