package Homework1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3) Реализовать простой калькулятор
public class Task3 {
    public double calculator(String input){
        Pattern pattern = Pattern.compile("^(\\d+)[ ]?([\\+\\-\\*\\/])[ ]?(\\d+)$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            int operand1 = Integer.parseInt(matcher.group(1));
            String operator = matcher.group(2);
            int operand2 = Integer.parseInt(matcher.group(3));
            
            return calculate(operand1, operator, operand2);
        } else {
            throw new IllegalArgumentException("Неправильное выражение");
        } 
    }

    public double calculate(double operand1, String operator, double operand2){
        switch(operator){
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": return operand1 / operand2;
            default: throw new IllegalArgumentException("Operator " + operator + " is illegal");
        }
    }
}
