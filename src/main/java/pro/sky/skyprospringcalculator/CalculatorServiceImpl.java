package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @GetMapping
    public String hello() {
        return "Привет";
    }

    @GetMapping
    public String answerHello() {
        return ("<b>Добро пожаловать в калькулятор</b ");
    }

    @GetMapping
    public String plus(@RequestParam("num1") Integer numOne,
                       @RequestParam("num2") Integer numTwo) {
        return numOne + " + " + numTwo + " = " + (numOne + numTwo);
    }

    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        return (num1 + " + " + num2 + " = " + (num1 - num2));
    }

    /*   public String multiply(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
           return buildView(num1, num2, calculatorService.multiply(num1, num2), "*");
       }


       public String divide(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2) {
           return buildView(num1, num2, calculatorService.divide(num1, num2), "/");
       }
   */
    private String buildView(Integer num1,
                             Integer num2,
                             Number result,
                             String operation) {
        return num1 + " " + operation + " " + num2 + " = " + result;
    }

}
