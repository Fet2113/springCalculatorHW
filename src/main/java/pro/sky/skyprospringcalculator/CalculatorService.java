package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    @GetMapping
    public String hello();

    @GetMapping
    public String answerHello();

    @GetMapping
    public String plus(@RequestParam("num1") Integer numOne,
                       @RequestParam("num2") Integer numTwo);

    String minus(@RequestParam(required = false) Integer num1,
                 @RequestParam(required = false) Integer num2);


 /*   public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2);


    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2); */
}
