package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.*;

@RestController


public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")

    public String answerHello() {
        return calculatorService.answerHello();
    }

    @RequestMapping("/calculator")

    @GetMapping(path = " /calculator/plus")
    public String plus(@RequestParam("num1") Integer numOne,
                       @RequestParam("num2") Integer numTwo) {
        if (numOne == null)
            return "Ошибка параметра1";
        if (numTwo == null)
            return "Ошибка параметра2";
        return calculatorService.plus(numOne, numTwo);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }


}
