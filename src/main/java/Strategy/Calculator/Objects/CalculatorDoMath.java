package Strategy.Calculator.Objects;

import Strategy.Calculator.Behavior.CalculationAdd;
import Strategy.Calculator.Behavior.CalculationMinus;

public class CalculatorDoMath {
    public static void main(String[] args) {

        Calculator newCalc = new Calculator(new CalculationAdd());
        System.out.println(newCalc.doMath(5,3));
        newCalc = new Calculator(new CalculationMinus());
        System.out.println(newCalc.doMath(5,3));

    }
}
