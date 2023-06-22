package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Привет";
    }
    public String answerHello() {
        return ("<b>Добро пожаловать в калькулятор</b ");
    }
}
