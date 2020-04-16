package ru.itis.calculatorservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.calculatorservice.services.CalculatorService;

@RestController
@Slf4j
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "/calculate")
    @ResponseBody
    public String calculate(@RequestParam("age") String age,
                          @RequestParam("gender") String gender,
                          @RequestParam("weight") String weight,
                          @RequestParam("height") String height,
                          @RequestParam("activity") String activity,
                          @RequestParam("formula") String formula) {
        long result = calculatorService.calculate(gender, formula, weight, height, age, activity);
        return "" + result;
    }
}
